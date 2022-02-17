package com.eturial.esale.server.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eturial.esale.common.entity.QueryRequest;
import com.eturial.esale.common.entity.system.SystemUser;

import java.util.List;

public interface IUserService {
    /**
     * 查找用户详细信息
     *
     * @param request request
     * @param user    用户对象，用于传递查询条件
     * @return IPage
     */
    IPage<SystemUser> findUserDetail(SystemUser user, QueryRequest request);
    List<SystemUser> findUserDetail();
    SystemUser findUser(String username);
    /**
     * 新增用户
     *
     * @param user user
     */
    void createUser(SystemUser user);

    /**
     * 修改用户
     *
     * @param user user
     */
    void updateUser(SystemUser user);


    void deleteUsers(String username);
}
