package com.sakha.oops;

public class OverloadingDemo {
  public static void main(String[] args) {
	Shape square = new Shape();
	Shape circle = new Shape();
	Shape rectangle  = new Shape();
	square.calculatearea(5);
	circle.calculatearea(2.5f);
	rectangle.calculatearea(4, 5);
}
}
class Shape {
	
	private int side;
	private int length;
	private int breadth;
	private float radius;
	
	public void calculatearea (float r) {
		System.out.println("Area of circle :" + 3.14 * r * r);
	}
	public void calculatearea (int l, int b) {
		System.out.println("Area of Rectangle :"+ l*b);
	}
	public void calculatearea (int s) {
		System.out.println("Area of Square :" + s * s);
	}
}