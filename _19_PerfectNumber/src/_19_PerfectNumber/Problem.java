package _19_PerfectNumber;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n=28;
		
		/*Perfect Number=
		 * The divisors of 28 is 1,2,4,7,14 and 28(excluding itself) its sum should be 28.
		 *Then it is called as a Perfect Square.
		 * 
		 * */
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		
		if(sum==n) {
			System.out.println(n+" It is a Perfect Number");
		}
		else {
			System.out.println(n+" It is not a Perfect Number");
		}
	}

}
