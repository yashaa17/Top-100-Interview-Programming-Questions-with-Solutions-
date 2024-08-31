package _22_HarshadNumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem=0,sum=0,n;
		
		System.out.println("Enter a Number:- ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		n=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		if(n%sum==0) {
			System.out.println("Entered Number is a Harshad Number");
		}
		else {
			System.out.println("Entered Number is Not a Harshad Number");
		}
	}

}
