package com.rogera.test;

public class Human {
//	MEMBER VARIABLES
	protected String name;
	protected int age;
	protected int health;
	
	
//	CONTRUCTORS
	
//	EMPTY CONSTRUCTOR
	public Human() {
		this.name = "Default Name;";
		this.age = 0;
		this.health = 100;
	}
	
//	FULL CONSTRUCTOR
	public Human(String name, int age, int health) {
		super();
		this.name = name;
		this.age = age;
		this.health = health;
	}


	
//	GETTERS / SETTERS / OTHER METHODS
	
	public void movement() {
		System.out.println("Walk");
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}

	
	
	
	
}
