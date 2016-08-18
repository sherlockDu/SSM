package com.dyl.ssm.service;

import com.dyl.ssm.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public boolean insertUuer(User user);
}
