package _04_GreatestOfTwoNos;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		if(num1==num2)
			System.out.println("Both Numbers are Equal");
		else if(num1>num2)
			System.out.println("Num1 is greate than Num 2");
		else
			System.out.println("Num2 is greater than Num1");
			

	}

}
