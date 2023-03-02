package oop_homework;

import java.util.Scanner;

public class Lec3_Practice_01 {
	public static void main(String[] args) {
		int i,j,k,n,t = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		n = sc.nextInt();
		for(i=1;i<n+1;i++) {
		for(j=0;j<n-i;j++) {
			System.out.print("\t");
		}
		for(k=0;k<n-j;k++) {
		System.out.print(i-k);
		System.out.print("\t");
		}
		for(t=2;t<i+1;t++) {
			System.out.print(t);
			System.out.print("\t");
		}
		System.out.println();
		}
	}
}