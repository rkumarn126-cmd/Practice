package demo;

import java.util.Scanner;

public class CheckAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		char ch=sc.next().charAt(0);
		
		if(ch>=0&&ch<=9) {
			System.out.println("it is a number! ");
		}else if(ch>='a'&&ch<='z') {
			System.out.println("it is a small character!");
		}else if(ch>='A'&&ch<='Z') {
			System.out.println("it is a capital character!");
		}else {
			System.out.println("it is a special character!");
		}
	}
}
