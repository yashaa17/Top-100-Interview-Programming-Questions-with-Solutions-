package _27_OctalToDecimal;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Octal Number:- ");
		int octal=sc.nextInt();
		
		double decimal=0;
		int n=0;
		
		while(octal>0) {
			int temp=octal%10;
			decimal=decimal+temp*Math.pow(8, n);
			octal=octal/10;
			n++;
		}
		System.out.println("Decimal Number:- "+decimal);
	}

}
