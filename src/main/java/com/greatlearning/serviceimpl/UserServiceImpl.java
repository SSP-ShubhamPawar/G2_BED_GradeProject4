package com.greatlearning.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.User;
import com.greatlearning.repository.Userrepo;
import com.greatlearning.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	Userrepo userrepo;
	
	@Override
	public String addUSer(User user) {
		// TODO Auto-generated method stub
		userrepo.saveAndFlush(user);
		return "Data save succesfully";
	}

}
