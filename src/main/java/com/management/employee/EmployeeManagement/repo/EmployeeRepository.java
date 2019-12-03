package com.management.employee.EmployeeManagement.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.employee.EmployeeManagement.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	void deleteById(Integer employeeId);
}
