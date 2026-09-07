package demo;

import java.util.Scanner;

public class Neon_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int sq=n*n;
		
		int sum=0;
		while(sq>0) {
			int d=sq%10;
			sum+=d;
			sq/=10;
		}
		if (sum==n) {
			System.out.println("it is a Neon Number! ");
		} else {
			System.out.println("it is not a Neon Number! ");
		}
	}
	
}
