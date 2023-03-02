package oop_homework;

import java.util.Scanner;

public class Lec3_Practice_02 {
	
	public static void main(String[] args) {
		
		int i=0;
		String[] r = {"scissor","rock","paper"};
		int[] scVer = {0,0};
		int p = (int)(3*Math.random());
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(scVer[1]-scVer[0]==2) {
				System.out.print("You won more than two times");
				break;
			}
			p=(int)(3*Math.random());
			System.out.printf("computer is %s.",r[p]);
			System.out.println();
			System.out.print("scissor (0), rock (1), paper (2): ");
			i=sc.nextInt();
			if(p==0 && i==1 ) {
				scVer[1]+=1;
				System.out.println("You won");
			
			}
			else if(p==0 && i==2) {
				scVer[0]+=1;
				System.out.println("You lose");
				
				
			}
			else if(p==1&& i==0) {
				scVer[0]+=1;
				System.out.println("You lose");
			}
			else if(p==1&& i==2) {
				scVer[1]+=1;
				System.out.println("You won");
				
			}
			else if(p==2 && i==0) {
				scVer[1]+=1;
				System.out.println("You won");
				
			}
			else if(p==2 && i==1) {
				scVer[0]+=1;
				System.out.println("You lose");
				
			}
			else if(p==i) {
				
			}
			else if(i<0 || i>2) {
				System.out.println("Wrong input");
			}
			
		}
	}
	
}
