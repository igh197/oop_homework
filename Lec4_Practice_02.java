package oop_homework;

public class Lec4_Practice_02 {
	public static boolean isPrimeNum(int endn) {  //�Ҽ� �Ǻ��Լ�
		int i=0;
		boolean result = true;
		for(i=2;i<endn;i++) {
			if(endn % i == 0) {
				result = false;
				break;
			}
			
		}
		return result;
	}
	public static void emirp(int n) { //n���� emirpã��
		int[] eArr = new int[200];
		int i =1;
		int start = 10;
		while(i<=n) {
			//emirp ���ǿ� ���� ����
			if(isPrimeNum(start)&& isPrimeNum(Lec4_Practice_01.reverse(start)) && !Lec4_Practice_01.isPalindrome(start)) {
				eArr[i-1]=start;
				System.out.print(eArr[i-1]+" ");
				
				if(i % 10 == 0) {
					System.out.println();   //10���� �ٹٲ�
				}
				i++;
			}
			
			start++;
		}
	}
	public static void main(String[] args) {
		System.out.println("emirp : ");
		emirp(120);
		
	}
}
