package _47_SumOfAllElementsInArray;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {22,4,12,65,24,15,23};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of All Array Elements is:- "+sum);
	}

}
