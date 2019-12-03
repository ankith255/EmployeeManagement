package com.management.employee.EmployeeManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.employee.EmployeeManagement.model.Employee;
import com.management.employee.EmployeeManagement.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> listAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	public Optional<Employee> getEmployee(String id) {
		return employeeRepository.findById(id);
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee, Integer employeeId) {
		employeeRepository.save(employee);

	}

	public void deleteEmployee(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
	}
}
