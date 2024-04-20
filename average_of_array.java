/* Implement a method to calculate the average of all elements in an array. */
package array;

import java.util.Scanner;

public class average_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int size;
        int sum=0;
        float average;
        
        
        Scanner in = new Scanner(System.in);
		//Accept the size of array.
        System.out.println("Enter the size of array : ");
        size=in.nextInt();
        
        int[] arr;
        arr = new int[size];
        
        //Accept the array elements
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("Enter the array elements : ");
        	arr[i]=in.nextInt();
        	
        }
        
        //Print the array elements
        
        System.out.print("The array element are : ");
        
        for(int j=0;j<arr.length;j++)
        {
        	System.out.println(arr[j]+" ");
        }
		
        //Sum of array elements
        for(int k=0;k<arr.length;k++)
        {
        	sum=sum+arr[k];
        }
        
        //Print sum of array elements
        System.out.println("Sum of array element is : "+sum);
        
        average = sum /arr.length;
        
        //print average of array elements
        System.out.println("Average of array element is: "+average);
	}

}
