package demo;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charcter: ");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("it is a vowel !");
		}else {
			System.out.println("it is not a vowel !");
		}
		
	}
}
