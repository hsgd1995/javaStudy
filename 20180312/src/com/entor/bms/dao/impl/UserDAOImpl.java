package com.entor.bms.dao.impl;

import com.entor.bms.dao.UserDAO;
import com.entor.bms.entity.UserInfo;
import com.entor.bms.utils.EditUtils;
import com.entor.bms.utils.ReadAndWriteUtils;

public class UserDAOImpl implements UserDAO {
    @Override
    public void insertUser(UserInfo userInfo) {
        ReadAndWriteUtils.singleWrite(EditUtils.editUserInfo(userInfo));
    }
}
