package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.entity.Employee;


public interface EmployeeService  
{
	public Employee getData(Employee emp);
	public List<Employee> getAlldata();
	public List<Employee> getEmployeeById(int id);
	public List<Employee> getEmployeeByName(String name);
	public List<Employee> getEmployeeSorted(Direction dir);
	public Employee updateEmployee(Employee emp);
	public String deleteById(int id); 	
	
}
