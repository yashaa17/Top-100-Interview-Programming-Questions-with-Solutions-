package _07_PrimeOrNot;

import java.util.Scanner;

public class Problem {
	public static boolean isPrime(int num) {
		if(num<=1) {
			//System.out.println("It is not a Prime Number");
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				//System.out.println("It is not a Prime Number");
				return false;	
		}
		return true;
		//System.out.println("It is Prime Number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		n=sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n+" is  a prime ");
		}
		else {
			System.out.println(n+" is not a prime Number");
		}

	}

}
