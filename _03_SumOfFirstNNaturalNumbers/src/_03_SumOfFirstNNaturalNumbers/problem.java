package _03_SumOfFirstNNaturalNumbers;

import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		int sum=0,num;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Number: ");
	num=sc.nextInt();
	
	for(int i=0;i<=num;i++) {
		sum=sum+i;
	}
	
	System.out.println("The sum of "+num+" Natural Numbers is: "+sum);
	
	

	}

}
