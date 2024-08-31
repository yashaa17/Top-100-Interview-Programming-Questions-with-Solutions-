package _26_BinaryToDecimal;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Binary Number:- ");
		int binary=sc.nextInt();
		
		int decimal=0;
		int n=0;
		
		while(binary>0) {
			int temp=binary%10;
			decimal=(int) (decimal+temp*Math.pow( 2,n));
			binary=binary/10;
			n++;
		}
		
		System.out.println("Decimal Number:- "+decimal);
		sc.close();
	}

}
