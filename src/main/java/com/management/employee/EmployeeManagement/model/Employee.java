package com.management.employee.EmployeeManagement.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String firstName;
	private String lastName;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfBirth;
	private String designation;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
	private List<Address> address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * public LocalDate getDateOfBirth() { return dateOfBirth; }
	 * 
	 * public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth =
	 * dateOfBirth; }
	 */

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
