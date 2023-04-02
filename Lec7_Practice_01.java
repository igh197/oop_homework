package oop_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lec7_Practice_01 {
	public static void main(String[] args) {
		int size1,size2,i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Students in course1: ");
		size1 = sc.nextInt();
		Scanner scan = new Scanner(System.in);
		String temp1= scan.nextLine();
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Number of Students in course2: ");
		size2 = sc2.nextInt();
		Scanner scan2 = new Scanner(System.in);
		String temp2 = scan2.nextLine();
		String[] t = temp1.split(", ");
		List<String> stud1= new ArrayList<String>();
		for(i=0;i<t.length;i++) {
		stud1.add(t[i]);
		}
		String[] t2 = temp2.split(", ");
		List<String> stud2=new ArrayList<String>();
		for(i=0;i<t2.length;i++) {
		stud2.add(t2[i]);
		}
		
		Course course1 = new Course(stud1);
		Course course2 = new Course(stud2);
		
		course1.dropStudent("Peter Jones");
		System.out.println("Number of students in course1 after drop Peter Jones: "+ course1.getStudents().size());
		for(i=0;i<course1.getStudents().size();i++) {
			System.out.print(course1.getStudents().get(i)+", ");
		}
		System.out.println();
		course1.clear();
		
		System.out.println("Number of students in course1 after clear: "+ course1.getStudents().size());
		course2.dropStudent("S2");
		System.out.println("Number of students in course2 after drop S2: "+course2.getStudents().size());
		for(i=0;i<course2.getStudents().size();i++) {
			System.out.print(course2.getStudents().get(i)+", ");
		}
		System.out.println();
		course2.clear();
		System.out.println("Number of students in course2 after clear: "+ course2.getStudents().size());

	}
}
