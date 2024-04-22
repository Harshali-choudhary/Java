/*    Implement a method to calculate the sum of all elements in an array. */
package array;

import java.util.Scanner;

public class sumofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int sum=0;
		//Scanner is used to accept the input from user
		Scanner sc=new Scanner(System.in);
		
		//Accept the size of array
		System.out.println("Enter the size of array : ");
		size=sc.nextInt();
		int[] arr;
		arr = new int[size];
		
		//Accept the array elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the array element : ");
			arr[i]=sc.nextInt();
		}
		
		//Print the array elements
		System.out.println();
		for(int j=0;j<arr.length;j++)
		{
		    System.out.println("The array element is : "+arr[j]+" ");	
		}
		
		
		//Sum the array elements
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		//Print the sum of array 
		System.out.println("Sum of array is : "+sum);
		
		

	}

}
