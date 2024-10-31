package _44_LargestAndSmallestElementInArray;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,43,56,76,87,24};
		int smallest=arr[0];
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Largest Element in an Array:- "+largest);
		System.out.println("Smallest Element in an Array:- "+smallest);
	}

}
