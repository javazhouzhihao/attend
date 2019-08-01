package com.pinyougou.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.pangpangpig.mapper.UserMapper;
import com.pangpangpig.pojo.User;
import com.pinyougou.user.service.UserService;
import java.lang.*;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void insert(User user) {
		
		userMapper.insert(user);
	
		
	}

	@Override
	public User selectByInviCode(String random) {
		// TODO Auto-generated method stub
		return userMapper.selectByInviCode(random);
	}

	@Override
	public void updateInviCode(String randomCode, Long id) {
		userMapper.updateInviCode(randomCode,id);
		
	}

	@Override
	public Long getMaxId() {
		// TODO Auto-generated method stub
		return userMapper.getMaxId();
	}

}
