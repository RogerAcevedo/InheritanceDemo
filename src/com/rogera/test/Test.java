package com.rogera.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CREATE VARIABLE
//		INSTANTIATING A "Human" & "Airbender"
		Human pleb = new Human();
//		CALLING OUR FULL CONSTRUCTOR FROM "AirBender" class
		AirBender aang = new AirBender("Aang", 14, 80, 200);
		
		System.out.println(pleb.getHealth());
		
		

	}

}
