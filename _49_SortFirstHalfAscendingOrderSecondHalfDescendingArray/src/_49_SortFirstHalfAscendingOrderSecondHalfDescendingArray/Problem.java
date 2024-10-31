package _49_SortFirstHalfAscendingOrderSecondHalfDescendingArray;

public class Problem {
	public static void printorder(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(int j=n/2;j<n-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		for(int i=0;i<n;i++) 
		System.out.print(arr[i]+" ");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2,3,5,6,10,40,20,50};
		int n=ar.length;
		printorder(ar,n);
		
	}

}
