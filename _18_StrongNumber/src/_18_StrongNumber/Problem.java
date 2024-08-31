package _18_StrongNumber;

public class Problem {

	public static int factorial(int n) {
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		return fact;
	}
	
	public static boolean detectStrong(int num) {
		int digit,sum=0;
		int temp=num;
		boolean flag=false;
		
		while(temp!=0) {
			digit=temp%10;
			sum=sum+factorial(digit);
			temp=temp/10;
		}
		
		if(sum==num)
			flag=true;
		else
			flag=false;
		
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145;
		
		if(detectStrong(num))
			System.out.println(num+" is a Strong Number");
		else
			System.out.println(num+" is not a strong Number");

	}

}
