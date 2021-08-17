package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.beans.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeRegistration
{
	@Autowired
	private EmployeeService empservice;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String registerEmployee(@RequestBody Employee employee) throws Exception
	{
		employee.setFname(employee.getFname());
		employee.setMiddleName(employee.getMiddleName());
		employee.setLastName(employee.getLastName());
		employee.setAge(employee.getAge());
		employee.setGender(employee.getGender());
		employee.setContactNumber(employee.getContactNumber());
		employee.setModified_by(employee.getModified_by());
		employee.setCreated_by(employee.getCreated_by());
		empservice.registerEmployee(employee);
		return "SUCCESS";
	}

	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public List<Employee> getEmployeelist() throws Exception
	{
		return empservice.getEmployeelist();
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEmployee(@RequestBody Employee employee) throws Exception
	{
		empservice.updateEmployee(employee);

		return "SUCCESS";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("id") int id) throws Exception
	{
		empservice.deleteEmployee(id);
		return "SUCCESS";
	}

	public EmployeeService getEmpservice()
	{
		return empservice;
	}

	public void setEmpservice(EmployeeService empservice)
	{
		this.empservice = empservice;
	}

}
