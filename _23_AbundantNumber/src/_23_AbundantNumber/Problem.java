package _23_AbundantNumber;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		
		System.out.println("Enter a Number:- ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1;i<num;i++) {
			if(num%i==0) 
				sum=sum+i;
		}
			if(sum>num) {
				System.out.println(num+" is an Abundant Number");
				System.out.println("Abundancy is "+(sum-num));
			}
			else 
				System.out.println(num+" is not an Abundant Number");
			
		}

	}


