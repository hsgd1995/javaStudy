package me.tang.bms.service.impl;

import me.tang.bms.dao.UserDAO;
import me.tang.bms.dao.impl.UserDAOImpl;
import me.tang.bms.entity.User;
import me.tang.bms.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO = new UserDAOImpl();

	/**
	 * �������ݷ��ʲ������û��ķ���
	 *
	 * @param userInfo
	 */
	@Override
	public void saveUser(User user) {
		userDAO.insertUser(user);
	}
}
