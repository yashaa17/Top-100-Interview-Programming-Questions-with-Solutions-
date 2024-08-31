package _09_SumOfDigitsOfNumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:- ");
		num=sc.nextInt();
				
		
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("The sum of a digit of a Number:-  "+sum);
	}

}
