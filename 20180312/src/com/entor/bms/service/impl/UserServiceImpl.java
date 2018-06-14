package com.entor.bms.service.impl;

import com.entor.bms.dao.UserDAO;
import com.entor.bms.dao.impl.UserDAOImpl;
import com.entor.bms.entity.UserInfo;
import com.entor.bms.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();

    /**
     * 调用数据访问层的添加用户的方法
     *
     * @param userInfo
     */
    @Override
    public void saveUser(UserInfo userInfo) {
        userDAO.insertUser(userInfo);
    }
}
