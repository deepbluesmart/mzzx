package com.goku.jjk.sys.mapper.ext;

import com.goku.jjk.sys.mapper.SysUserRoleMapper;

/**
 * Created by nbfujx on 2018/2/6.
 */
public interface SysUserRoleExtMapper  extends SysUserRoleMapper {
    int deleteUserRole(String userid);
}
