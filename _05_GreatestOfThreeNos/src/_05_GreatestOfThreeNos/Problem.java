package _05_GreatestOfThreeNos;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		int num1,num2,num3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a First Number: ");
		num1=sc.nextInt();
		
		System.out.println("Enter a Second Number: ");
		num2=sc.nextInt();
		
		System.out.println("Enter a Third Number: ");
		num3=sc.nextInt();
		
		if(num1>=num2 && num1>=num3)
			System.out.println("Number 1 is Greatest");
		else  if(num2>=num3 && num2>=num1)
			System.out.println("Number 2 is Greatest");
		else if(num3>=num2 && num3>=num1)
		System.out.println("Number 3 is Greatest");
			
	}

}
