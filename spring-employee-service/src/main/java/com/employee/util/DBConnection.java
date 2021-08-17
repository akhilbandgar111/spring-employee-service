package com.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	private static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=employee;user=sa;password=Akhil@123ct";
	public static Connection con;

	private DBConnection()
	{
		// private constructor to avoid object creation
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		synchronized (DBConnection.class)
		{
			if (con == null)
			{
				Class.forName(DRIVER_CLASS);
				con = DriverManager.getConnection(URL);
			}
		}
		return con;
	}
}
