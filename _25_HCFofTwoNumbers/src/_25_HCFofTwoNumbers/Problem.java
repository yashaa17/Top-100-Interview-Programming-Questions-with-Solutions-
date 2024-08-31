package _25_HCFofTwoNumbers;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,hcf=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:- ");
		num1=sc.nextInt();
		System.out.println("Enter Second Number:- ");
		num2=sc.nextInt();
		
		for(int i=1;i<=num1 || i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				hcf=i;
			}
			
		}
		System.out.println("The HCF of"+num1+" and "+num2+" is "+hcf);
	}

}
