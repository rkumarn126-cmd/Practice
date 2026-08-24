package demo;

import java.util.Scanner;

public class SmallestOfThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first=sc.nextInt();
		System.out.print("enter the second number: ");
		int second=sc.nextInt();
		System.out.println("Enter the threed number: ");
		int third=sc.nextInt();
		
		int smallest=(first<second)?(first<third)?first:third:(second<third)?second:third;
		
		System.out.println(smallest);
	}
}
