package com.lumen.objbasics;

public class Student {
	String name;
	String department;
	
    Student( String name, String department){
	this.name=name;
	this.department=department;
  
    }


   void printDetails() {
	   System.out.println("Student name "+name);
	   System.out.println("Department name "+department);
   }
   
   void getGrades(int...marks) {
	   int sum = 0;
		
		for (int mark : marks) {
			sum+=mark;
		}
		int avg = sum/marks.length;
		
		if (avg > 90 && avg < 100) {
			System.out.println("you secured A grade");
		} else if (avg > 80 && avg < 89) {
			System.out.println("You secured B grade");
   		} else if (avg > 70 && avg < 79) {
   			System.out.println("You secured C grade");
   		} else if (avg > 60 && avg < 69) {
   			System.out.println("You secured D grade");
   		} else if (avg > 50 && avg < 59) {
   			System.out.println("You secured E grade");
   		} else {
   			System.out.println("You Failed");
   		}
		
       }
    	   

}
