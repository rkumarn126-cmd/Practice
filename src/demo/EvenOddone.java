package demo;

import java.util.Scanner;

public class EvenOddone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("it's Even!");
		}else {
			System.out.println("it's Odd!");
		}
		
	}
}
