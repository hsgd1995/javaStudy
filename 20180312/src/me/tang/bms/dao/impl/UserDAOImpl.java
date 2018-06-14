package me.tang.bms.dao.impl;

import me.tang.bms.dao.UserDAO;
import me.tang.bms.entity.User;
import me.tang.bms.utils.EditUtils;
import me.tang.bms.utils.ReadAndWriteUtils;

public class UserDAOImpl implements UserDAO {
	@Override
	public void insertUser(User user) {
		ReadAndWriteUtils.singleWrite(EditUtils.editUserInfo(user));
	}
}
