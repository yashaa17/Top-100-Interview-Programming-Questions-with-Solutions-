package _17_PrimeFactorsOfNumber;

public class Problem {
	
	public static int isprime(int n) {
		for(int i=2;i<Math.sqrt(n);i++) {
		if(n%i==0) {
			return 0;
		}
		}
		return 1;
	}
	
	public static void primeFactors(int n) {
		for(int i=2;i<=n;i++) {
			if(isprime(i)==1) {
				int x=n;
				
				while(x%i==0) {
					System.out.println(i+" ");
					x/=i;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=90;
		primeFactors(n);
	}

}
