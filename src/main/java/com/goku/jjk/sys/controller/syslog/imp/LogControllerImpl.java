package com.goku.jjk.sys.controller.syslog.imp;

import com.goku.jjk.sys.controller.syslog.LogController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nbfujx on 2018/1/16.
 */
@Controller
@RequestMapping("/sys/log")
public class LogControllerImpl implements LogController {

    @Override
    @RequestMapping("/getListPage")
    @RequiresPermissions(value={"sys:log:query"})
    public String  list(Model model) {
        return  "sys/log/list";
    }

}
