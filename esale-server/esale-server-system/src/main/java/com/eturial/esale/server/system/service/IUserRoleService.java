package com.eturial.esale.server.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eturial.esale.common.entity.system.UserRole;

public interface IUserRoleService {
    void deleteUserRolesByRoleId(String[] roleIds);

    void deleteUserRolesByUserId(String[] userIds);
}
