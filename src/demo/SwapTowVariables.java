package demo;

import java.util.Scanner;

public class SwapTowVariables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first variable: ");
		int first=sc.nextInt();
		System.out.println("Enter second variable: ");
		int second=sc.nextInt();
		
		int a=first;
		first=second;
		second=a;
		
		System.out.println("first="+first);
		System.out.println("second="+second);
	}

}
