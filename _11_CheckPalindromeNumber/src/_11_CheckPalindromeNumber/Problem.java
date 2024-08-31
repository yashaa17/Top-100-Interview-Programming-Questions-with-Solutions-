package _11_CheckPalindromeNumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12021,reverse=0,rem,temp;
		temp=num;
		//Scanner sc=new Scanner(System.in);
		
	//	System.out.println("Enter a Number to check whether it is a palindrome or not: ");
		
		while(temp!=0) {
			rem=temp%10;
			reverse=reverse*10+rem;
			temp=temp/10;
		}
		
		if(num==reverse) {
			System.out.println(num+" is a Palindrome Number");
		}
		else {
			System.out.println(num+" is not a Palindrome Number");
		}
			
	}

}
