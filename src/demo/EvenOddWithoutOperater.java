package demo;

import java.util.Scanner;

public class EvenOddWithoutOperater {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n=new Scanner(System.in).nextInt();
		
		if((n&1)==0) {
			System.out.println("it's even!");
		}else {
			System.out.println("it' odd");
		}
	}
}
