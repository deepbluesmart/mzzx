package com.goku.jjk.sys.controller.index.impl;

import com.alibaba.fastjson.JSON;
import com.goku.jjk.sys.controller.index.IndexRestController;
import com.goku.jjk.sys.model.ext.Breadcrumb;
import com.goku.jjk.sys.util.BreadcrumbUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nbfujx on 2017/12/25.
 */
@RestController
@RequestMapping("/api/sys")
public class IndexRestControllerImpl implements IndexRestController {

    @Autowired
    BreadcrumbUtil breadcrumbUtil;

    @RequestMapping("/index")
    @RequiresPermissions(value={"sys:index:*"})
    public String  index() {
        List<Breadcrumb> Breadcrumbs= breadcrumbUtil.getBreadcrumbPath("sys/index");
        return JSON.toJSONString(Breadcrumbs);
    }
}
