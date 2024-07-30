package com.revature;

public class CalculateGrade {

	public static void main(String[] args) {
		
		int totalStudents = 90;
		int boys = 45;
		int totalGradeA = totalStudents / 2;
		int boysGradeA = 20;
		int girlGradeA = totalGradeA - boysGradeA;
		System.out.println("The total number of girls getting grade 'A' :" +girlGradeA);

	}

}
