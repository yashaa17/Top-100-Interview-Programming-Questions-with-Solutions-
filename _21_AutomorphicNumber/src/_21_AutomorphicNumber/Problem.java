package _21_AutomorphicNumber;

import java.util.Scanner;

public class Problem {
	
	public static boolean isAutomorphic(int num) {
		int sqr=num*num;
		
		while(num>0) {
			if(num%10 != sqr%10) 
				return false;
				num=num/10;
				sqr=sqr/10;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:- ");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(isAutomorphic(num)) {
			System.out.println("Entered Number is a Automorphic number");
		}
		else {
			System.out.println("Entered Number is Not a Automorphic Number");
		}
		
	}

}
