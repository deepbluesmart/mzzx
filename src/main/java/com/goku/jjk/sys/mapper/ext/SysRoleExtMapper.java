package com.goku.jjk.sys.mapper.ext;

import com.goku.jjk.sys.mapper.SysRoleMapper;
import com.goku.jjk.sys.model.SysRole;

import java.util.List;

/**
 * Created by nbfujx on 2018/1/23.
 */
public interface SysRoleExtMapper extends SysRoleMapper {
    List<SysRole> getRoleForPaging();
    List<SysRole> getUserRoleForTree(String userid);
}
