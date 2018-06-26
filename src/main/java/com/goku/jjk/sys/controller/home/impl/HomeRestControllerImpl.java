package com.goku.jjk.sys.controller.home.impl;

import com.goku.jjk.sys.controller.home.HomeRestController;
import com.goku.jjk.sys.util.BreadcrumbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017/12/25.
 */
@RestController
@RequestMapping("/api")
public class HomeRestControllerImpl implements HomeRestController {
    @Autowired
    BreadcrumbUtil breadcrumbUtil;


}
