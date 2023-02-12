package studentDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	List<String> courses = new ArrayList<String>();
	private int tutionBalance = 0;
	private int numOfCourses = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructer prompt user to enter student name and year.
	public Student(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = input.nextLine();
		
		System.out.println("Enter Student Last Name: ");
		this.lastName = input.nextLine();
		
		System.out.println("1 - Fresher\n2 - Junior\n3 - Senior");
		System.out.println("Enter Student Grade Year: ");
		this.gradeYear = input.nextInt();
		
		setStudentId();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
	}
	
	//Generate the studentId
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//Enroll courses and increase the tution fees accordingly
	//Enter Courses
	public void enrollCourses() {
		System.out.println("Enter the number of courses which you want take:");
		Scanner inputForCourseNumber = new Scanner(System.in);
		this.numOfCourses = inputForCourseNumber.nextInt();
		System.out.println("Enter the courses:");
		for (int i=0; i<numOfCourses; i++) {
			Scanner inputForCourseName = new Scanner(System.in);
			courses.add(inputForCourseName.nextLine());
		}
		System.out.println("Courses Enrolled");	
		this.tutionBalance = numOfCourses*costOfCourse;
		System.out.println("You Tution Balance is: "+ this.tutionBalance);
	}
	
	
	//Display Course
	public void displayCourse(){
		if(courses.isEmpty() == false) {
		System.out.println("Enrolled courses is: "+ courses);
		}else {
			System.out.println("No Course is enrolled");
		}
	}


}
