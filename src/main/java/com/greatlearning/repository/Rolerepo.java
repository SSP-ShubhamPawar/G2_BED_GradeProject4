package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.greatlearning.entity.Role;

public interface Rolerepo extends CrudRepository<Role, String>{





}
