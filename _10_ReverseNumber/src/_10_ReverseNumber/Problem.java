package _10_ReverseNumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0,rem;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number to reverse:- ");
		int num=sc.nextInt();
		
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("The Reverse of a"+num+" is:- "+reverse);

	}

}
