create database employee;

CREATE TABLE employee_details(id INT IDENTITY NOT NULL,
first_name VARCHAR(100) NOT NULL,
middle_name VARCHAR(100)  NULL,
last_name VARCHAR(100) NULL,
age INT NOT NULL,
gender VARCHAR(20) NOT NULL,
contect_number BIGINT  NULL,
created_by VARCHAR(70) NOT NULL,
created_on DATE NOT null,
modified_by VARCHAR(50) NOT NULL,
modified_on DATE NOT NULL,
is_deleted TINYINT NOT NULL,
CONSTRAINT PK_employee PRIMARY KEY(id),
CONSTRAINT uk_employee UNIQUE (first_name,middle_name,last_name))