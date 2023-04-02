package oop_homework;

import java.util.Scanner;

public class Lec6_Practice_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] weights = new int[6];
		System.out.print("계수 입력: ");
		for(int i=0;i<6;i++) {
			weights[i]=sc.nextInt();
			}
		LinearEquation le = new LinearEquation(weights[0],weights[1],weights[2],weights[3],weights[4],weights[5]);
		if(le.isSolvable()) {
			System.out.println("x: "+le.getX());
			System.out.println("y: "+le.getY());
		}
		else {
			System.out.println("The equation has no solution");
		}
	}
}
