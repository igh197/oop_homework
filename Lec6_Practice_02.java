package oop_homework;

import java.util.Scanner;

public class Lec6_Practice_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x=new int[4];
		int[] y =new int[4];
		System.out.print("좌표값 입력: ");
		for(int i=0;i<4;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		LinearEquation crossPoint = new LinearEquation(y[0]-y[1],x[1]-x[0],y[2]-y[3]
				,x[3]-x[2],x[1]*y[0]-x[0]*y[1],x[3]*y[2]-x[2]*y[3]);
		if(crossPoint.isSolvable()) {
			System.out.println("x: "+crossPoint.getX());
			System.out.println("y: "+crossPoint.getY());
		}
		else {
			System.out.println("The equation has no solution");
		}
	}
}
