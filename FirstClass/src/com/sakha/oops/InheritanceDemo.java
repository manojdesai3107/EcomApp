package com.sakha.oops;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		Baseclass baseobj = new Baseclass();
		baseobj.baseval3 = 10;
		Derivedclass derobj1 = new Derivedclass();
		derobj1.derval3 = 20;
		baseobj.display();
		derobj1.display();
	}

}
 //This is a base class
 class Baseclass {
	 private int baseval1;
	 private float baseval2;
	 public int baseval3;
	 
	 public void display() {
		 System.out.println("basevalue 1 :" + baseval1);
		 System.out.println("basevalue 2 :" + baseval2);
		 System.out.println("basevalue 3 :" + baseval3);
	 }
	 public void show() {
		 System.out.println("basevalue 1 :" + baseval1);
		 System.out.println("basevalue 2 :" + baseval2);
		 System.out.println("basevalue 3 :" + baseval3);
	 }
 }
 /*This is a derived class
  * also called as child class*/
	 class Derivedclass extends Baseclass {
		 private int derval1;
		 private float derval2;
		 public float derval3;
		 
		 public void display() {
			 System.out.println("derivedvalue  1 :" + derval1);
			 System.out.println(" derivedvalue 2 :" + derval2);
			 System.out.println("derivedvalue 3 :" + derval3);
		 }
		 public void show() {
			 System.out.println("derivedvalue 1 :" + derval1);
			 System.out.println("derivedvalue 2 :" + derval2);
			 System.out.println("derivedvalue 3 :" + derval3);
		 }
		 
	 }
 