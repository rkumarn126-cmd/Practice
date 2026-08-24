package demo;

import java.util.Scanner;

public class GreatestOfThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first=sc.nextInt();
		System.out.print("enter the second number: ");
		int second=sc.nextInt();
		System.out.println("Enter the threed number: ");
		int third=sc.nextInt();
		
		if(first>second) {
			if(first>third) {
				System.out.println("First is greatest");
			}else {
				System.out.println("third is greatest");
			}
		}else if(second>third){
			System.out.println("second is greatest");
		}else {
			System.out.println("third is greatest");
		}
	}
}
