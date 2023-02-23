package oop_homework;

import java.util.Scanner;

public class Lec2_Practice_01 {

	public static void main(String[] args) {
		int i,num =0;  //변수 num은 입력받을 정수
		System.out.print("Enter a integer between 0 and 1000: ");
		
		int[] digits = {0,0,0};  //자릿수
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		digits[0] = num / 100;     // 몫과 나머지를 이용한 자릿수 구하기
		digits[1] = num % 100 / 10;
		digits[2] = num % 100 % 10;
		
		System.out.printf("The multiplication of all digits in %d is %d",num,digits[0]*digits[1]*digits[2]);
	}

}
