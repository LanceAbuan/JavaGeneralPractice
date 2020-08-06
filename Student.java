package beginning;

import java.util.Scanner;

class Student {
	
	String name;
	int student_id;
	double GPA;
	String favorite_subject;
	
	Student(String n, int i, double g, String fs){
		this.name = n;
		this.student_id = i;
		this.GPA = g;
		this.favorite_subject = fs;
		
		
		
	}
	
	
	void selfIntroduction() {
		System.out.println("Hello! My name is "+this.name+".");
		System.out.println("My Student ID is "+this.student_id+" and my GPA is "+this.GPA+".");
		System.out.println("My favorite subject is "+this.favorite_subject+".");
	}
	
	
	
	
	//TODO remove this comment


}
