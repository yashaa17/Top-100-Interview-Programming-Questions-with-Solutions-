package _45_SecondLargestElementInArray;

public class Problem {
	public static int secLargest(int arr[],int n) {
		int largest=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		int sec_largest=Integer.MIN_VALUE;
		//int sec_largest=-1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>sec_largest && arr[i]!=largest) {
				sec_largest=arr[i];
			}
		}
		return sec_largest;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,1,10,34,50};
		int n=arr.length;
		System.out.println("Second Largest Element in Array:- "+secLargest(arr,n));
	}

}
