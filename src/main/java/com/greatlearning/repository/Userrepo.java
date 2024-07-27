package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.User;

public interface Userrepo extends JpaRepository<User, User>{

}
