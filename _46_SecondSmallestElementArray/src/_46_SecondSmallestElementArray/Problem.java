package _46_SecondSmallestElementArray;

public class Problem {

	public static int secSmallest(int arr[],int n) {
		int smallest=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		int secSmallest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<secSmallest && arr[i]!=smallest) {
				secSmallest=arr[i];
			}
		}
		
		return secSmallest;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,35,56,76,67,24,25};
		int n=arr.length;
		System.out.println("Second Smallest No in an Array:-"+secSmallest(arr,n));
		
		
	}

}
