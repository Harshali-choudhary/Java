/* Implement a method to sort the elements of an array in ascending order using any
sorting algorithm of your choice (e.g., bubble sort, selection sort).*/
package array;

import java.util.Scanner;

public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
        //Sort the array elements
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		int temp;
        		if(arr[i]>arr[j])
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        
        System.out.print("Array after sorting : ");
        for(int k=0;k<arr.length;k++)
        {
        	System.out.print(arr[k]+" ");
        }
	}

}
