package oop_homework;

import java.util.Scanner;

public class Lec5_Practice_01 {
	
	public static int partition(int[] list) {
		int high = list.length;
		int low=1;
		int temp;
		int pivot = list[0];
		while(low<=high) {
			do {++low;}
			while(list[low]<=pivot);
			do {--high;}
			while(list[high]>pivot);
			if(low<=high) {
				temp = list[low];
				list[low]=list[high];
				list[high]=temp;
				
			}
		}
		list[0]=list[high];
		list[high]=pivot;
		return high;
	}
	
	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] list = new int[n];
		System.out.print("Enter a list: ");
		for(i=0;i<n;i++) {
			list[i] = sc.nextInt();
		}
		partition(list);
		System.out.print("After the partition, the list is ");
		for(i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
}
