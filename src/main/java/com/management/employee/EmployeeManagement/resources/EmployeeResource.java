 package com.management.employee.EmployeeManagement.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.management.employee.EmployeeManagement.model.Employee;
import com.management.employee.EmployeeManagement.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public List<Employee> listAllEmployees() {
		return employeeService.listAllEmployees();
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public Optional<Employee> getEmplyee(@PathVariable("employeeId") String employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return employee;
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable("employeeId") Integer employeeId, @RequestBody Employee employee) {
		employeeService.updateEmployee(employee, employeeId);
		return employee;
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}

}
