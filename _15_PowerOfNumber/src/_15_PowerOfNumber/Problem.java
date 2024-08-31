package _15_PowerOfNumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a base");
		int base=sc.nextInt();
		
		System.out.println("Enter a Exponent");
		int exponent=sc.nextInt();
		
		/*int result=1;
		
		for(int i=0;i<exponent;i++) {
			result=result*base;
		}
		
		System.out.println(base+" raised to the power of "+exponent+" is "+result);*/
		
		double result=Math.pow(base, exponent);
		System.out.println(base+" raised to the power of "+exponent+" is "+result);
		

	}

}
