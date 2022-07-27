package logical_programs;

import java.util.Arrays;

//Java program to find second largest element in Array 
public class sencond_largestNo
{
	 public static void main(String[] args) 
	    {
	   	 int [] arr=new int[] {21,23,34,45,56,67,98,87,76,99,43,22};
	     Arrays.sort(arr);
	     
	     for(int i :arr)
	     {
	   	  System.out.print(i+" ");
	     }
	     
	     System.out.println();
	     int i=arr[arr.length-2];

	   	 System.out.println("second largest no= "+i);
		}
}
