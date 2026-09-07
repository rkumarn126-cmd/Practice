package demo;

import java.util.Scanner;

public class Second_Heights_Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start Number: ");
		int start=sc.nextInt();
		System.out.println("Enter end Number: ");
		int end=sc.nextInt();
		int count=0;
		
		for(int i=end;i>=start;i--) {
			int n=i;
			boolean flag=true;
			for(int j=2;j<=(n/2);j++) {
				if(n%j==0) {
					flag=false;
				}
			}
			if(flag) {
				count++;
				if(count==2) {
					System.out.println(n);
				}
				
			}
		}
	}
}
