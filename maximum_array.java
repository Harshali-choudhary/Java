package array;

import java.util.Scanner;

public class maximum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr;
             int size;
             
             Scanner sc= new Scanner(System.in);
           
             System.out.println("Enter the size of array : ");
             size = sc.nextInt();
           
             arr=new int[size];
             Scanner in = new Scanner(System.in);
             
             for(int i=0;i<arr.length;i++)
             {
    	          System.out.println("Enter the array element : ");
    	          arr[i]=in.nextInt();   
             }
       
             System.out.println("Elements of array are : ");
       
             for(int i=0;i<arr.length;i++)
             {
    	        System.out.print(arr[i]);
    	        System.out.print(" ");
              }
       

	         for(int i=0;i<arr.length;i++)
	         {
		           for(int j=i+1;j<arr.length;j++)
		           {
			            if(arr[i]<arr[j])
			             {
			            	int temp;
				            temp=arr[i];
				            arr[i]=arr[j];
				            arr[j]=temp;
			             }
		
		           }
	         }
	
	  System.out.println();
	 System.out.println("Sorting the array in descending order : ");
	
     	for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
	
	 System.out.println("Maximum element is : "+arr[0]);
	
      }
}
  
