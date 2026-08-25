package demo;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		if(num>=0&&num<=9) {
			System.out.println("it is a single digit!");
		}else if(num>=10&&num<=99) {
			System.out.println("it is double digit!");
		}else if(num>=100 && num<=999) {
			System.out.println("it is triple digit!");
		}else {
			System.out.println("it is more then triple!");
		}
	}
}
