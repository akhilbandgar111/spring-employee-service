package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.beans.Employee;
import com.employee.dao.EmployeeDao;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeDao employeedao;

	public void registerEmployee(@RequestBody Employee employee) throws Exception
	{
		employeedao.registerEmployee(employee);
	}

	public List<Employee> getEmployeelist() throws Exception
	{
		return employeedao.getEmployeelist();
	}

	public void updateEmployee(@RequestBody Employee employee) throws Exception
	{
		employeedao.updateEmployee(employee);
	}

	public void deleteEmployee(int empId) throws Exception
	{
		employeedao.deleteEmployee(empId);
	}

}
