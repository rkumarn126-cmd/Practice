package demo;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int sum=0;
		int mul=1;
		
		while(n>0) {
			sum=sum+(n%10);
			mul=mul*(n%10);
			n/=10;
		}
		
		if (sum==mul) {
			System.out.println("it is a spy number!");
		} else {
			System.out.println("it is not a spy number!");
		}
	}
}
