package me.tang.bms.service;

import me.tang.bms.entity.User;

/**
 * 用户服务接口
 */
public interface UserService {
	/**
	 * 保存注册用户
	 *
	 * @param userInfo
	 */
	void saveUser(User user);
}
