package demo;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		int copy=num;
		int sum=0;
		while(num>0) {
			int fact=1;
			for(int i=1;i<=(num%10);i++) {
				fact=fact*i;
			}
			sum+=fact;
			num/=10;
		}
		if (sum == copy) {
			System.out.println("It is a strong number!");
		} else {
			System.out.println("It is not a strong number!");
		}
	}
}
