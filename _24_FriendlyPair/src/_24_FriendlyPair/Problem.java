package _24_FriendlyPair;

import java.util.Scanner;

public class Problem {
	public static int getDivisorsSum(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:- ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number:- ");
		int num2=sc.nextInt();
		
		int sum1=getDivisorsSum(num1);
		int sum2=getDivisorsSum(num2);
		
		if(sum1/num1 == sum2/num2) {
			System.out.println(num1+" & "+num2 +"are friendly Pairs");
		}
		else {
			System.out.println(num1+" & "+num2 +"are not friendly Pairs");
		}

	}

}
