package _48_ReversingAnArray;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,24,53,45,18,40};
		int n=arr.length;
		int i=0,j=n-1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}

}
