package _30_DecimalToOctal;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal=148;
		int octal[]=new int[20];
		int i=0;
		
		while(decimal>0) {
			int r=decimal%8;
			octal[i++]=r;
			decimal=decimal/8;
		}
		
		System.out.println("Octal Number:- ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(octal[j]);
			//sc.close();
		}
	}

}
