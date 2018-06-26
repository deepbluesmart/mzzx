package com.goku.jjk.sys.service;

import com.github.pagehelper.PageInfo;

import java.util.Date;

/**
 * Created by nbfujx on 2018/1/16.
 */
public interface SysLogService {
    PageInfo getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum);
}
