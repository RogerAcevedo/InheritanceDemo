package com.rogera.test;

// "extends" gives us access to our "Human" class
public class AirBender extends Human{
	
//	MEMBER POLYMORPHISM -allows us to access & modify from parent
	protected int airResistance;
	
	
	
//	CONSTRUCTORS
//	EMPTY CONSTRUCTOR
	public AirBender() {
//		super(); references our "Human" class/ empty constructor
		super();
		this.airResistance = 100;
	}


//FULL CONSTRUCTOR
//	when generating a new constructor, we will need to type out our parameters
	public AirBender(String name, int age, int health, int airResistance) {
//	need to pass our name, age, health to set our customs values in "test" class
		super(name, age, health);
		this.airResistance = airResistance;
	}





	
	
//	GETTERS/ SETTERS/ OTHER METHODS
	
	public void movement() {
		System.out.println("Fly");
	}
	
	public int getAirResistance() {
		return airResistance;
	}



	public void setAirResistance(int airResistance) {
		this.airResistance = airResistance;
	}
	
	
	
	
	
}
