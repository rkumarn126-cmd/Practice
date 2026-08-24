package demo;

import java.util.Scanner;

public class GreatestOftwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first=sc.nextInt();
		System.out.println("Enter the second number: ");
		int second=sc.nextInt();
		
		int greater=first>second?first:second;
		
		System.out.println(greater);
	}
}
