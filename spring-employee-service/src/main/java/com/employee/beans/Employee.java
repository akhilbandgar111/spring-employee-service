package com.employee.beans;

import java.util.Date;

public class Employee
{
	private int empId;
	private String fname;
	private String middleName;
	private String lastName;
	private int age;
	private String gender;
	private long contactNumber;
	private String modified_by;
	private Date modified_on;
	private String created_by;
	private Date created_on;

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getMiddleName()
	{
		return middleName;
	}

	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public long getContactNumber()
	{
		return contactNumber;
	}

	public void setContactNumber(long contactNumber)
	{
		this.contactNumber = contactNumber;
	}

	public String getModified_by()
	{
		return modified_by;
	}

	public void setModified_by(String modified_by)
	{
		this.modified_by = modified_by;
	}

	public Date getModified_on()
	{
		return modified_on;
	}

	public void setModified_on(Date modified_on)
	{
		this.modified_on = modified_on;
	}

	public String getCreated_by()
	{
		return created_by;
	}

	public void setCreated_by(String created_by)
	{
		this.created_by = created_by;
	}

	public Date getCreated_on()
	{
		return created_on;
	}

	public void setCreated_on(Date created_on)
	{
		this.created_on = created_on;
	}

	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", fname=" + fname + ", middleName=" + middleName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", contactNumber=" + contactNumber + ", modified_by=" + modified_by + ", modified_on=" + modified_on
				+ ", created_by=" + created_by + ", created_on=" + created_on + "]";
	}

}
