package com.sakha.string;

public class Car extends MotorisedVehicle implements IVehicle {

	@Override
	public void drive() {
		System.out.println("Driver drives the Car");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("Handsignal is shown to turn left");
		
	}

	@Override
	public void brake() {
		System.out.println("The car is in brake mode");
		
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.brake();
	    c.checkMotor();
	    c.drive();
	    c.turnLeft();
	}
}
