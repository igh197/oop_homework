package oop_homework;

import java.util.Scanner;

public class Lec5_Practice_02 {
	public static void main(String[] args) {
		int n,i,j,temp1,temp2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직원 수: ");
		n = sc.nextInt();
		int[] emp = new int[n];
		int[] sumDays = new int[n];
		int[][] wHours = new int[n][7];
		System.out.println("근무시간 입력: ");
		for(i=0;i<n;i++) {
			emp[i]=i;
			for(j=0;j<7;j++) {
				wHours[i][j]=sc.nextInt();
				sumDays[i] += wHours[i][j]; 
			}
			
		}
		for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
				if(sumDays[i]<sumDays[j]) {
					temp1=sumDays[i];
					sumDays[i]=sumDays[j];
					sumDays[j]=temp1;
					temp2=emp[i];
					emp[i]=emp[j];
					emp[j]=temp2;
				}
			}	
		System.out.println("Employee "+emp[i]+": "+sumDays[i]);
		}
		
	}
}
