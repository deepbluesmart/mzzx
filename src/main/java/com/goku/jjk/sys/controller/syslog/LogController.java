package com.goku.jjk.sys.controller.syslog;

import com.goku.jjk.sys.config.log.LoggerInfo;
import org.springframework.ui.Model;

/**
 * Created by nbfujx on 2018/1/16.
 */
public interface LogController {

    @LoggerInfo(Method = "/sys/log/getListPage",Name = "日志列表")
    String  list(Model model);
}
