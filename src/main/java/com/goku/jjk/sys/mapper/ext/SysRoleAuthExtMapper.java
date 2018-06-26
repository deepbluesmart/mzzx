package com.goku.jjk.sys.mapper.ext;

import com.goku.jjk.sys.mapper.SysRoleAuthMapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by nbfujx on 2018/2/5.
 */
public interface SysRoleAuthExtMapper extends SysRoleAuthMapper {
    int deleteRoleAuthByModuleId(@Param("roleid") String roleid, @Param("id") String id);
}
