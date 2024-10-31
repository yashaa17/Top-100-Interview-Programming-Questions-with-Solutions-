package _43_MinimumElementInArray;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,1,10,34,20};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum Element in an Array:- "+min);

	}

}
