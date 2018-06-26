package com.goku.jjk.sys.mapper.ext;

import com.goku.jjk.sys.mapper.SysModuleMapper;
import com.goku.jjk.sys.model.SysModule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by nbfujx on 2017/12/30.
 */
public interface SysModuleExtMapper extends SysModuleMapper {
   List<SysModule> getUserModules(@Param("UserId")  String UserId);
   List<SysModule> getModuleForPaging();
   int deleteModuleByids(@Param("ids")  String ids);

}
