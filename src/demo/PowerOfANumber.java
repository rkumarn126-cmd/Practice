package demo;

import java.util.Scanner;

public class PowerOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("Enter the pow: ");
		int p=sc.nextInt();
		int pow=1;
		for(int i=1;i<=p;i++) {
			pow=pow*num;
		}
		System.out.println(pow);
	}
}
