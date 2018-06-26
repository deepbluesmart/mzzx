package com.goku.jjk.sys.controller.sysmodule;

import com.goku.jjk.sys.config.log.LoggerInfo;
import com.goku.jjk.sys.model.SysModule;

/**
 * Created by nbfujx on 2018/1/10.
 */
public interface ModuleRestController {
    @LoggerInfo(Method = "/api/sys/module/save",Name = "模块新增")
    String  save( SysModule symodule);
    @LoggerInfo(Method = "/api/sys/module/delete",Name = "模块删除")
    String  delete(String Ids);
}
