package _02_OddEven;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Entered Number is a Even Number");
		}
		else {
			System.out.println("Entered Number is a Odd Number");
		}

	}

}
