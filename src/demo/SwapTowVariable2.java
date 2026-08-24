package demo;

import java.util.Scanner;

public class SwapTowVariable2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first variable: ");
		int first=sc.nextInt();
		System.out.println("Enter second variable: ");
		int second=sc.nextInt();
		
		first=first+second;
		second=first-second;
		first=first-second;
		
		System.out.println("first="+first);
		System.out.println("second="+second);
	}
}
