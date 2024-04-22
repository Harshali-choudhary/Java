package array;

import java.util.Scanner;

public class client_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array_operation a1 = new array_operation();
		
		 int size;
	        Scanner sc = new Scanner(System.in);
	        
	        
	        //Accept the size of array
	        System.out.println("Enter the size of array : ");
	        size=sc.nextInt();
	        
	        int[] arr;
	        arr = new int[size];
	        
	        //Accept the array elements
	        for(int i=0;i<arr.length;i++)
	        {
	        	System.out.println("Enter the array element : ");
	        	arr[i]=sc.nextInt();
	        }
	        
	        //Print the Array element
	        System.out.print("The array elements are : ");
	        for(int j=0;j<arr.length;j++)
	        {
	           System.out.println(arr[j]+" ");
	        }
	        
	        //Sort the array function is call
	        System.out.println("After sorting the array : ");
	        int sort[] = a1.sort_array(arr);
	        for(int j=0;j<arr.length;j++)
	        {
	           System.out.print(sort[j]+" ");
	        }
	        
	        System.out.println();
	        
	        //Maximum element of array
	        System.out.println("Maximum element in an array : "+a1.maximum(arr));
	        
	        //sum of array elements
	        System.out.println("Sum of array elements is : "+a1.Sum(arr));
	        
	        //Average of array elements
	        System.out.println("Average of array element is : "+a1.Average(arr));
	}

}
