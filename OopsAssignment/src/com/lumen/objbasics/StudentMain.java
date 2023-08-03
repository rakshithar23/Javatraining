package com.lumen.objbasics;

public class StudentMain {
	public static void main(String[] args) {
		
		
		Student student=new Student("rakshu","ise");
        
		student.printDetails();
       
		
		student.getGrades(92,56,71);
		

		Student student1 = new Student("vaishu", "cse");
		
		student1.printDetails();
		
		student1.getGrades(80,92,86);

}
}



