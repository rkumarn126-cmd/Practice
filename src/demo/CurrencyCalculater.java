package demo;

import java.util.Scanner;

public class CurrencyCalculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency! ");
		int m=sc.nextInt();
		
		if(m>500) {
			
			System.out.println("500 ="+(m/500));
			m=m%500;
			if(m>200) {
				System.out.println("200 ="+(m/200));
				m=m%200;
			}if(m>100) {
				System.out.println("100="+(m/100));
				m=m%100;
			}if(m>0) {
				System.out.println(m);
			}
		} 
		
	}
}
