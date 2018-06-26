package com.goku.jjk.sys.service;

import com.github.pagehelper.PageInfo;
import com.goku.jjk.sys.model.SysModule;

import java.util.List;

/**
 * Created by nbfujx on 2018/1/1.
 */
public interface SysModuleService {
    List<SysModule> getUserModules(String UserId);
    SysModule selectByPrimaryKey(String id);
    PageInfo getModuleForPaging();
    int saveModule(SysModule symodule);
    int deleteModuleByids(String ids);
}
