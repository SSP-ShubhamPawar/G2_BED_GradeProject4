package com.greatlearning.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Employee;




@Repository
public interface Employeerepo extends JpaRepository<Employee, String>
{

	void deleteById(int id);
	
}
