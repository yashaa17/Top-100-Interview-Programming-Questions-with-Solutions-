package _20_PerfectSquare;

import java.util.Scanner;

public class Problem {
	
	public static boolean isPerfectSquare(double number) {
		double sqrt= Math.sqrt(number);
		
		return (sqrt-Math.floor(sqrt)==0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:- ");
		Scanner sc=new Scanner(System.in);
		double number=sc.nextInt();
		
		if(isPerfectSquare(number)) {
			System.out.println("Entered Number is a Perfect Square");
		}
		else
			System.out.println("Entered Number is not a perfect Square");
	}

}
