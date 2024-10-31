package _38_NoOfDigitsInInteger;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:- ");
		int num=sc.nextInt();
		int digit=0;
		
		while(num!=0) {
			int last_digit=num%10;
			digit++;
			num=num/10;
		}
		System.out.println("Number of Digits:- "+digit);
	}

}
