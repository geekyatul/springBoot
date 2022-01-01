package com.wipro.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    
	@Column(name="Id")
	@Id
	private int id;
	@Column(name="full_name")
	private String name;
	
	private String email;
	private String location;
	
	public Employee() {};
	
	public Employee(int id, String name, String email, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + "]";
	}
	
	
	
   
}