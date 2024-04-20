/*Write a main program to demonstrate these operations:
f. Create an array of integers and initialize it with some values.
g. Call the methods implemented in steps 1 to 4 to perform the respective operations.
h. Display the results of each operation. */

package array;

public class array_operation {
	
	private int sum=0;
	private int temp=0;
    
	//sort function
	public int[] sort_array(int[] arr)
	{
		//int temp=0;
		 for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=i+1;j<arr.length;j++)
	        	{
	        	
	        		if(arr[i]>arr[j])
	        		{
	        			temp=arr[i];
	        			arr[i]=arr[j];
	        			arr[j]=temp;
	        		}
	        	}
	        }
		 return arr;
	}
	
	//Maximum element function
	public int maximum(int[] arr)
	{
		int[] a = sort_array(arr);
		int max = a[arr.length-1];
		return max;

	}
	
	//Sum of array elements function
	public int Sum(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
	//Average of array elements
	public float Average(int[] arr)
	{
		int x=0;
		x = Sum(arr);
		return x;
	}
}
