package _08_PrintingPrimeNumbersWithinGivenRange;

import java.util.Scanner;

public class Problem {
	/*public static boolean isPrime(int n) {
		int count=0;
		if(n<2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower,upper;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a lower bound interval:- ");
		lower=sc.nextInt();
		System.out.println("Enter a upper bound interval:- ");
		upper=sc.nextInt();
		
		for(int i=lower;i<=upper;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}

	}*/
	
	
	
	
	
	
	
	
	
	public static boolean isPrime(int n) {
		int count=0;
		
		if(n<2) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int lower,upper;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Lower Bound Interval:- ");
		lower=sc.nextInt();
		
		System.out.println("Enter Upper Bound Interval:- ");
		upper=sc.nextInt();
		
		for(int i=lower;i<=upper;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
	}

}
