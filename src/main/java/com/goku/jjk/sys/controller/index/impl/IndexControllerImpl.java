package com.goku.jjk.sys.controller.index.impl;

import com.goku.jjk.sys.controller.index.IndexController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nbfujx on 2017/12/25.
 */
@Controller
@RequestMapping("/sys")
public class IndexControllerImpl implements IndexController {

    @Override
    @RequestMapping("/index")
    @RequiresPermissions(value={"sys:index:*"})
    public String  index(Model model) {
        return  "sys/index";
    }



}
