package com.greatlearning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int  id;

@Column(name="firstName")
private String firstName;

@Column(name = "lastName")
private String lastname;

@Column(name ="email")
private String email;



}
