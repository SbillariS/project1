package Array;

public class sizeofarray
{
   public static void main(String[] args)
   {
	  int [] arr=new int[] {10,11,22,23,34,43,45,56,65,76,78,98,99,90,54,55,12,77,9,8,5};
  
   for(int a : arr)
   {
	   System.out.print(a+" ");
   }
   System.out.println();
   System.out.println("size of array = " + arr.length);
  
   }
}
