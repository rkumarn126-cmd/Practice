package demo;

import java.util.Scanner;

public class Neon_Number_In_GivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number: ");
		int start = sc.nextInt();
		System.out.println("Enter end number: ");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {

			int sq = i * i;

			int sum = 0;
			while (sq > 0) {
				int d = sq % 10;
				sum += d;
				sq /= 10;
			}
			if (sum == i) {
				System.out.println(i);
			} 
		}
	}
}
