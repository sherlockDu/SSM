package com.dyl.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dyl.ssm.dao.IUserDao;
import com.dyl.ssm.pojo.User;
import com.dyl.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	public boolean insertUuer(User user) {
		return this.userDao.insert(user)>0?true:false;
	}

}
