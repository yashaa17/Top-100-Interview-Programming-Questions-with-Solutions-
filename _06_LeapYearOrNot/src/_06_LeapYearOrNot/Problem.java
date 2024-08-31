package _06_LeapYearOrNot;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		int year;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Year");
		year=sc.nextInt();
		
		if(year%100==0) {
			if(year%400==0) {
				System.out.println("Entered Year is a Leap Year");
			}
			else {
				System.out.println("Entered Year is not a Leap Year");
			}
		}
		else {
			if(year%4==0) {
				System.out.println("Entered Year is a Leap Year");
			}
			else {
				System.out.println("Entered Year is Not a Leap Year");
			}
		}
		

	}

}
