package com.lumen.overloading;

public class Employee {
	String name;
	String department;
public Employee(String name, String department) {
	super();
	this.name = name;
	this.department = department;
	}
	double calcBonus(double basicAllowance) {
		return basicAllowance*10;
	}
	double calcBonus(double basicAllowance, double carAllowance) {
		return basicAllowance*10+carAllowance;
	}

    double calcBonus(double basicAllowance,double houseAllowance,double carAllowance) {
    	return basicAllowance*10+houseAllowance+carAllowance;

    }

 
}

 
	

