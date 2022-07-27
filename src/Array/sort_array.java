package Array;

import java.util.Arrays;

public class sort_array
{
  public static void main(String[] args)
  {
	 int [] arr=new int[] {98,67,45,34,23,99,88,87,89,77,54};
  
      System.out.println("original arrays");
      
      for(int i : arr)
      {
    	  System.out.print(i+" ");
      }
      
      System.out.println();
      System.out.println("arrays in asending order");
      Arrays.sort(arr);
      
      for(int i :arr)
      {
    	  System.out.print(i+" ");
      }
      
      System.out.println();
      System.out.print("arrays in decending order");
      System.out.println();
      
      for(int i=arr.length-1; i>=0; i--)
      {
    	  System.out.print(arr[i]+" ");
      }
      
  }
}
