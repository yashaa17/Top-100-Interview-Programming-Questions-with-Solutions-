package _13_FindingParticularNoInFibonacci;

public class F2Problem {

	public static int fib(int n) {
		int n1=0,n2=1,n3;
		
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stuint 
		int n=9;
		System.out.println(fib(n));

	}

}
