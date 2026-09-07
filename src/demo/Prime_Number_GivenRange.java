package demo;

import java.util.Scanner;

public class Prime_Number_GivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start Number: ");
		int start=sc.nextInt();
		System.out.println("Enter end Number: ");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			int n=i;
			boolean flag=true;
			for(int j=2;j<=(n/2);j++) {
				if(n%j==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println(n);
			}
		}
	}
}
