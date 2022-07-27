package practice2;

public class duplicate_integer 
{
	 public static void main(String args[])
	  {
	     int [] arr=new int[]{11,12,34,56,78,11,12};

	      for(int i=0; i<=arr.length-1; i++)
	      {
	         for(int j=i+1; j<=arr.length-1; j++)
	         {
	            if(arr[i]==arr[j])
	            {
	               System.out.print(arr[i]+" ");
	            }
	         }
	         System.out.println();
	      }
	  }
}
