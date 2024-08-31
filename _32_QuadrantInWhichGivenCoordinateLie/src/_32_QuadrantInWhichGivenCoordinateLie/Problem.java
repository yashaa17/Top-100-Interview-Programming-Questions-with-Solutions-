package _32_QuadrantInWhichGivenCoordinateLie;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value for X Co-ordinate");
		int x=sc.nextInt();
		
		System.out.println("Enter value for Y Co-ordinate");
		int y=sc.nextInt();
		
		if(x>0 && y>0) 
			System.out.println("Co-ordinate lies in First Quadrant");
		else if(x<0 && y>0)
			System.out.println("Co-ordinate lies in Second Quadrant");
		else if(x<0 && y<0)
			System.out.println("Co-ordinate lies in Third Quadrant");
		else if(x>0 && y<0)
			System.out.println("Co-ordinate lies in Fourth Quadrant");
		else if(x==0 && y==0)
			System.out.println("Co-ordinate lies On Origin");
		else if(x!=0 && y==0)
			System.out.println("Co-ordinate lies on X-axis");
		else if(x==0 && y!=0)
			System.out.println("Co-ordinate lies on Y-axis");

	}

}
