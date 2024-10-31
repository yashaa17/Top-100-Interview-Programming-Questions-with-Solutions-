package _41_FindingNoOfIntegersWhichHasExactlyXDivisors;

public class Problem {

	public static void main(String[] args) {
		int n=10,x=3;
		int count=0;
		
		for(int i=1;i<=n;i++) {
			int counter_fact=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					counter_fact++;
				}
			}
			if(counter_fact==x) {
				count++;
			}
		}
		System.out.println(count);

	}

}
