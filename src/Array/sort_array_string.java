package Array;

import java.util.Arrays;

public class sort_array_string
{
    public static void main(String[] args)
    {
   	 String [] str=new String[] {"mayuri","shital8","rahul9","sanika","vitthal","mayur"};
   	 System.out.println("original arrays");
   	 
   	 for(String i : str)
   	 {
   		 System.out.print(i+" ");
   	 }
    
    System.out.println();
    System.out.println("asending order");
   	 Arrays.sort(str);

   	  for(String i:str)
   	  {
   		  System.out.print(i+" ");
   	  }
   	  System.out.println();
   	  System.out.print("decending order");
   	  System.out.println();
	
    for(int i=str.length-1; i>=0; i--)
    {
    	System.out.print(str[i]+" ");
    }
    }
}
