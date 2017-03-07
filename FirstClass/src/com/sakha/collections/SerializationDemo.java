package com.sakha.collections;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(12312432, "Ramesh", 100000);
        System.out.println("Before Process :"+ e1);
        
        //Serialization Process starts
		//FileInputStream fos = new FileInputStream("c:/notes.txt");
		//ObjectOutputStream oos = new ObjectOutputStream(fos);
		//oos.writeObject(e1);
		//oos.flush();
		//oos.close();
		//Serialization Process ends
		
		//De-serialization Process Starts
		//FileInputStream fis = new FileInputStream("c:/notes.txt");
		//ObjectOutputStream ois = new ObjectOutputStream(fis);
		System.out.println("After Deserialization");
		//System.out.println("Result: " + ois.readObject());
		//ois.close();
		//De-serialization Process ends
	}

}
class Emp implements Serializable {
	long empid;
	String empName;
	transient long empsalary;
	
	public Emp(long empid, String empName, long empsalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empName=" + empName + "]";
	}
	
	
}