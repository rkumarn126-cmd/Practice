package demo;

import java.util.Scanner;

public class Metrimony {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		
		System.out.println("Enter your age: ");
		int age =sc.nextInt();
		
		if(age>=21 && age<=35 ) {
			System.out.println(name+" you are eligible for marriage!");
		}else {
			System.out.println(name+" you are not eligible for marriage! ");
		}
		
	}
}
