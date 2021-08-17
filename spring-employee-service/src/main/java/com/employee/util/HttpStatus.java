package com.employee.util;

public enum HttpStatus
{
	SUCCESS("success"), ERROR("error");

	private String status;

	private HttpStatus(String status)
	{
		this.status = status;
	}

	@Override
	public String toString()
	{
		return status;
	}
}
