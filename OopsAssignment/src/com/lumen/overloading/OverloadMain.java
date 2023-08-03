package com.lumen.overloading;

public class OverloadMain {
public static void main(String[] args) {
	Employee programmer = new Employee("rak", "se");
	Employee manager = new Employee("ram", "hr");
	Employee director = new Employee("lak", "senior");
	System.out.println("programmer bonus "+programmer.calcBonus(40000));
	System.out.println("manager bonus "+manager.calcBonus(352846, 50000));
	System.out.println("director bonus "+director.calcBonus(2567434, 121456, 131310));
}
}

 


