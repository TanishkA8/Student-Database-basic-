package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {	
		//Ask user how many students he want to add
		System.out.println("Enter the number of Students you want to add :");
		Scanner sc = new Scanner(System.in);
		int numberOfStudent = sc.nextInt();
		Student[] stu = new Student[numberOfStudent];
		
		//Student generation
		for (int i=0; i<numberOfStudent; i++) {
			stu[i] = new Student();
			stu[i].enrollCourses();
			stu[i].displayCourse();
			System.out.println("First Student is Enrolled Successfully");
		}

	}

}
