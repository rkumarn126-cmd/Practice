package demo;

import java.util.Scanner;

public class ArmStrong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int p=0;
		int copy=n;
		while(n>0) {
			p++;
			n/=10;
		}
		int sum=0;
		n=copy;
		while(n>0) {
			int digit=n%10;
			int pow=1;
			
			for(int i=1;i<=p;i++) {
				pow=pow*digit;
			}
			sum+=pow;
			n/=10;
		}
		
		if(sum==copy) {
			System.out.println("it is a ArmStrong Number");
		}else {
			System.out.println("it is not ArmStrong Number");
		}
	}
}
