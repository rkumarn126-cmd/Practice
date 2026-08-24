package demo;

import java.util.Scanner;

public class OddEvenZero {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n=new Scanner(System.in).nextInt();
		if(n==0) {
			System.out.println("it's zero! ");
		}else if((n&1)==0) {
			System.out.println("it's even!");
		}else {
			System.out.println("it's odd! ");
		}
	}
}
