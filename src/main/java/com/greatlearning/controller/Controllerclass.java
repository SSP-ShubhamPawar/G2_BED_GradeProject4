package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Employee;
import com.greatlearning.service.EmployeeService;





@RestController
public class Controllerclass {
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/api/employees")
	public List<Employee> getEmployeeDetails()
	{
		return empservice.getAlldata();
	}
	
	@GetMapping("/api/employees/{id}")
	public List<Employee> getEmployeeById(@RequestParam(value ="id") int id)
	{
		return empservice.getEmployeeById(id);
	}
	
	@PostMapping("/api/employees")
	public Employee getEmployeeDetails(Employee emp )
	{
		return empservice.getData(emp);
	}
	
	@GetMapping("/api/employees/{name}")
	public List<Employee> getEmployeeByName(@RequestParam(value ="name") String name)
	{
		return empservice.getEmployeeByName(name);
	}
	
	@GetMapping("/api/employees/sort?order={dir}")
	public List<Employee> getEmployeeSorted(@PathVariable(value="dir") Direction dir)
	{
		return empservice.getEmployeeSorted(dir);
	}
	
	@PutMapping("/api/employees/update")
	public Employee updateEmployee(@RequestBody Employee emp) 
	{
		return empservice.updateEmployee(emp);
	}
	
	@DeleteMapping("/api/employees/search/{id}")
	public String deleteById(@RequestParam(value = "id") int id)
	{
		return empservice.deleteById(id);
	} 
	
		

}
