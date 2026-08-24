package demo;

import java.util.Scanner;

public class SmallestOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first=sc.nextInt();
		System.out.println("Enter the second number: ");
		int second=sc.nextInt();
		
		if(first<second) {
			System.out.println("first number is smallest!");
		}else {
			System.out.println("second number is smallest!");
		}
	}
}
