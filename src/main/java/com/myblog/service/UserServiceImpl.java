package com.myblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myblog.dao.UserMapper;
import com.myblog.domain.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userMapper.findAllUser();
	}

}
