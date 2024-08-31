package _14_FactorialOfANumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		int i,fact=1,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number you want to print its Factorial:- ");
		n=sc.nextInt();
		
		for(i=2;i<n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of  "+n+" is "+fact);

	}

}
