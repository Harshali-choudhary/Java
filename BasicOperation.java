package MatrixRepresentation;

import java.util.Scanner;

public class BasicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row;
		int column;
		System.out.println("How many rows you want : ");
		row=sc.nextInt();
		
		System.out.println("How many columns you want : ");
		column=sc.nextInt();
		
	//Print first matrix
		
		int[][] arr;
		arr= new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Enter the matrix elements : ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The matrix is : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+"   ");
			
			}
			System.out.println();
		}
		
        //Print second matrix
		int[][] arr1;
		arr1= new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Enter the matrix elements : ");
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The matrix is : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr1[i][j]+"   ");
			
			}
			System.out.println();
		}
		
		//Add two matrix
		int[][] sum;
		sum= new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		
		System.out.println("Sum of matrix is : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(sum[i][j]+"   ");
			
			}
			System.out.println();
		}
		
		//substract two matrix
		int[][] sub;
		sub= new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sub[i][j]=arr[i][j]-arr1[i][j];
			}
		}
		
		System.out.println("Substraction of matrix is : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(sub[i][j]+"   ");
			
			}
			System.out.println();
		}
	}

}
