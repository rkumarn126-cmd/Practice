package demo;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		int copy=num;
		int sum=0;
		
		 while(num>0) {
			int d=num%10;
			sum=sum*10+d;
			num/=10;
		 }
		 if(sum==copy) {
			 System.out.println("It is a Palindrome!");
		 }else {
			 System.out.println("It is not a Palindrome!");
		 }
		 
	}
}
