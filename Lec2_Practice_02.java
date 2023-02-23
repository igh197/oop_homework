package oop_homework;

import java.util.Scanner;

public class Lec2_Practice_02 {
	public static void main(String[] args) {
		double edge1=0;
		double edge2=0;
		double edge3=0;
		System.out.print("Enter three edges (length in double): ");
		Scanner sc = new Scanner(System.in);
		edge1 = sc.nextDouble();
		edge2 = sc.nextDouble();
		edge3 = sc.nextDouble();
		
		if(edge1 >= edge2+edge3 || edge2 >= edge1+edge3 || edge3 >= edge2+edge1) {
				System.out.println("Input is invalid");
			}
		else {
			System.out.printf("The perimeter is %.1f", edge1+edge2+edge3);
			}
		}
}
