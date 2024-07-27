package com.greatlearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.entity.Employee;





@SpringBootApplication
public class GradeprojectMain implements CommandLineRunner {
	
	public static void main(String args[])
	{
		SpringApplication.run(GradeprojectMain.class, args);
		System.out.println("Main method called");	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee emp = Employee.builder().firstName("Shubham").email("shubham.pawar@newgensoft.com").lastname("Pawar").build();
		// TODO Auto-generated method stub
		
	}

}
