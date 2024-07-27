package com.greatlearning.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Role;
import com.greatlearning.repository.Rolerepo;
import com.greatlearning.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	Rolerepo rolerepo;
	
	@Override
	public String addRole(Role role) {

		rolerepo.save(role);
		return "Data Added succesfully";
	}

}
