package com.greatlearning.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Employee;
import com.greatlearning.repository.Employeerepo;
import com.greatlearning.service.EmployeeService;





@Service
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	Employeerepo emprepo;
	

	@Override
	public List<Employee> getAlldata() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public List<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee tempemp = new Employee();
		tempemp.setId(id);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().
				withMatcher("id", ExampleMatcher.GenericPropertyMatchers.exact()).
				withIgnorePaths("firstName","lastName","email");
		Example<Employee> example = Example.of(tempemp,exampleMatcher);
		
		return emprepo.findAll(example);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		Employee tempemp= new Employee();
		tempemp.setFirstName(name);
		ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase()
				.withMatcher("firstName", ExampleMatcher.GenericPropertyMatchers.exact()).
				withIgnorePaths("id","lastName","email");
		
		Example<Employee> example = Example.of(tempemp,exampleMatcher);
		return emprepo.findAll(example);
	}

	@Override
	public List<Employee> getEmployeeSorted(Direction dir) 
	{
		return emprepo.findAll(Sort.by(dir,"id"));
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		/*
		 * int id =emp.getId(); Example example = Example.of(id);
		 * if(emprepo.exists(example)) {
		 */
			return emprepo.saveAndFlush(emp);
		//}
		
	}

	@Override
	public String deleteById(int id) {
		//String s =  id+"";
		emprepo.deleteById(id);
		return "Deleted employee id - " + id;
		
		
	}

	@Override
	public Employee getData(Employee emp) {
		// TODO Auto-generated method stub
		return emprepo.saveAndFlush(emp);
	}
	


}
