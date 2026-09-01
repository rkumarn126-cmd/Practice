package demo;

import java.util.Scanner;

public class EvenOddNumberSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int st=sc.nextInt();
		System.out.println("Enter ending number: ");
		int end=sc.nextInt();
		int evenSum=0;
		int oddSum=0;
		
		for(int i=st;i<=end;i++) {
			if(i==1) {
				continue;
			}else if(i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddSum=oddSum+i;
			}
		}
		System.out.println("evenSum= "+evenSum);
		System.out.println("oddSum= "+oddSum);
	}
}
