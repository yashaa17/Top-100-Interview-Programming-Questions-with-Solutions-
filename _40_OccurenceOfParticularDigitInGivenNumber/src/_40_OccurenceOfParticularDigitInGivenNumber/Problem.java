package _40_OccurenceOfParticularDigitInGivenNumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:- ");
		int num=sc.nextInt();
		System.out.println("Enter a Digit:- ");
		int digit=sc.nextInt();
		int count=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem==digit) {
				count++;
			}
			num=num/10;
		}
		System.out.println("Number of Occurence of "+digit+" is "+count);

	}

}
