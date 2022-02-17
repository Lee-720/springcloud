package com.eturial.esale.server.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eturial.esale.common.entity.system.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRoleMapper {
    /**
     * 根据用户Id删除该用户的角色关系
     *
     * @param userId 用户 ID
     * @return boolean
     */
    Boolean deleteByUserId(@Param("userId") Long userId);

    /**
     * 根据角色Id删除该角色的用户关系
     *
     * @param roleId 角色 ID
     * @return boolean
     */
    Boolean deleteByRoleId(@Param("roleId") Long roleId);

    void newUserRole (@Param("userRole") UserRole userRole);
}
