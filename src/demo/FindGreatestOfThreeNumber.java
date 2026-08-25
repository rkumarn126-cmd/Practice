package demo;

import java.util.Scanner;

public class FindGreatestOfThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first=sc.nextInt();
		System.out.println("Enter the second number: ");
		int second=sc.nextInt();
		System.out.println("Enter the third number: ");
		int third=sc.nextInt();
		
		if(first>second) {
			if(first>third) {
				System.out.println("first is greatest");
			}else {
				System.out.println("third is greatest");
			}
		}else if(second>first) {
			if(second>third) {
				System.out.println("second is greatest");
			}else {
				System.out.println("third is greatest");
			}
		}else {
			System.out.println("third is greatest");
		}
	}
}
