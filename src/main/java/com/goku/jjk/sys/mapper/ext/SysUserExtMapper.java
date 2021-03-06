package com.goku.jjk.sys.mapper.ext;

import com.goku.jjk.sys.mapper.SysUserMapper;
import com.goku.jjk.sys.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by nbfujx on 2018/1/4.
 */
public interface SysUserExtMapper extends SysUserMapper {
     SysUser getUserByUsername(@Param("username") String username);
     List<SysUser> getUserForPaging(@Param("username")String username, @Param("name") String name,
                                    @Param("orderFiled") String orderFiled, @Param("orderSort") String orderSort);
}
