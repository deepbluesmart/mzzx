package com.goku.jjk.sys.controller.sysmenu;

import com.goku.jjk.sys.config.log.LoggerInfo;
import com.goku.jjk.sys.model.SysMenu;

/**
 * Created by nbfujx on 2018/1/10.
 */
public interface MenuRestController {
    @LoggerInfo(Method = "/api/sys/menu/save",Name = "菜单新增")
    String  save( SysMenu symenu);
    @LoggerInfo(Method = "/api/sys/menu/delete",Name = "菜单删除")
    String  delete(String menuId);
}
