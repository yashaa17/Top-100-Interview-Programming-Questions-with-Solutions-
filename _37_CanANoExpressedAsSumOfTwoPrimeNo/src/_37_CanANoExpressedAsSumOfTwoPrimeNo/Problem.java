package _37_CanANoExpressedAsSumOfTwoPrimeNo;

import java.util.Scanner;

public class Problem {

public static int sumprimes(int n) {
	int isPrime=1;
	
	for(int i=2;i<n/2;++i) {
		if(n%i==0) {
			isPrime=0;
			break;
		}
	}
	return isPrime;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int num=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<num/2;++i) {
			if(sumprimes(i)==1) {
				if(sumprimes(num-i)==1)
				{
					System.out.println(num+" can be expressed as sum of "+i+" and "+(num-i));
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.println(num+" cannot be expressed as sum of two primes");
		}
	}

}
