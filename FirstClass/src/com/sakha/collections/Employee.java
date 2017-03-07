package com.sakha.collections;

import java.io.Serializable;

public class Employee implements Serializable {

	long empID;
	String empName;
	transient long empSalary;
    Employee(long empID, String empName,long empSalary) {
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
    public String toString() {
    	return "Employee ID = " + empID +
    			"Employee Name is " + empName + "Employee Salary is " + empSalary;
    }
	
}
