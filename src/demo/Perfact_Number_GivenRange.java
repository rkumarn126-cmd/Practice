package demo;

import java.util.Scanner;

public class Perfact_Number_GivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start Number: ");
		int start=sc.nextInt();
		System.out.println("Enter end Number: ");
		int end=sc.nextInt();
		
		for(int j=start;j<=end;j++) {
		int sum=0;
		for(int i=1;i<=j/2;i++) {
			if(j%i==0) {
				sum+=i;
			}
		}
		if(sum==j) {
			System.out.println(j);
		}
		}
	}
}
