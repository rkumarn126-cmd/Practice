package demo;

import java.util.Scanner;

public class GreatestOfTwoNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		int first=sc.nextInt();
		System.out.println("Enter the second Number: ");
		int second=sc.nextInt();
		
		if(first>second) {
			System.out.println("first is greatest! ");
		}else {
			System.out.println("Second is greatest! ");
		}
	}
}
