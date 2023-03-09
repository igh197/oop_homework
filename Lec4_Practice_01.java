package oop_homework;

import java.util.Scanner;

public class Lec4_Practice_01 {
	
	public static int reverse(int number) { //리버스 구하는 함수
		int[] nArr = new int[100];
		int i=0;
		int result=0;
		int temp = number;
		int digi = (int)(Math.log10(number)+1);
		for(i=0;i<digi;i++) {
			nArr[i]= temp /(int)( Math.pow(10,digi-i-1)); 
			temp -= nArr[i]*(int)( Math.pow(10,digi-i-1));
		}
		for(i=0;i<digi+1;i++) {
			result += nArr[i]*(int)(Math.pow(10,i));
		}
		return result;
	}
	public static boolean isPalindrome(int number) { //palindrome 구하는 함수
		if(number == reverse(number)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int number= 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("input: ");
		number = sc.nextInt();
		if(isPalindrome(number)) {
			System.out.println(reverse(number));
			System.out.println("This number is palindrome");
		}
		else {
			System.out.println(reverse(number));
			System.out.println("This number is not palindrome");
		}
	}
}
