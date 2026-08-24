package demo;

import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numnber: ");
		int n=sc.nextInt();
		
		String st=(n%2==0)?"Even":"Odd";
		
		System.out.println(st);
	}
}
