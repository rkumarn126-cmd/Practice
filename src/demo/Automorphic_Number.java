package demo;

import java.util.Scanner;

public class Automorphic_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		int mul=num*num;
		boolean flag=true;
		while(num>0) {
			if((mul%10)!=(num%10)) {
				flag=false;
				break;
			}else {
				num/=10;
				mul/=10;
			}
		}
		if (flag) {
			System.out.println("it is a automorphic number!");
		} else {
			System.out.println("it is not automorphic number!");
		}
		
		
	}
}
