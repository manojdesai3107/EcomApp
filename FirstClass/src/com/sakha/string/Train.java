package com.sakha.string;

public class Train implements IVehicle,IPublicTransport {

	@Override
	public void getNumberOfPeople() {
		System.out.println("There are more 1000 passangers in the Train");
		
	}

	@Override
	public void drive() {
		System.out.println("Driver stopped the Train and Driver is changed");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("After that Train turns left");
		
	}

	@Override
	public void brake() {
		System.out.println("If station comes then brake has to be applied");
		
	}

}
