package demo;

import java.util.Scanner;

public class SmallestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first=sc.nextInt();
		System.out.println("Enter the second number: ");
		int second=sc.nextInt();
		
		int smallest=first<second?first:second;
		
		System.out.println(smallest);
	}

}
