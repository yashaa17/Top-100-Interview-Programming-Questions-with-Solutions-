package _39_ContNoOfDaysInMonth;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Year:- ");
		int year=sc.nextInt();
		System.out.println("Enter the Month:- ");
		int month=sc.nextInt();
		
		if((month==2)&&(year%4==0 || ( (year%100!=0)&&(year%400==0)))){
			System.out.println("Number of days is 29");
		}
		else if(month==2)
			System.out.println("No. of days is 28");
		else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			System.out.println("No. of days is 31");
		else
			System.out.println("No. of days is 30");
	}

}
