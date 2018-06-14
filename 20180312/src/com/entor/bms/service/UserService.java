package com.entor.bms.service;

import com.entor.bms.entity.UserInfo;

/**
 * 用户服务接口
 */
public interface UserService {
    /**
     * 保存注册用户
     *
     * @param userInfo
     */
    void saveUser(UserInfo userInfo);
}
