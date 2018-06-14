package com.entor.bms.dao;

import com.entor.bms.entity.UserInfo;

public interface UserDAO {
    /**
     * 添加注册数据
     *
     * @param userInfo
     */
    void insertUser(UserInfo userInfo);
}
