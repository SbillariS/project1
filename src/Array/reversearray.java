package Array;

public class reversearray
{
   public static void main(String[] args)
   {
	 int [] arr=new int[] {21,23,34,45,56,67,98,87,76,99,43,22};
	 
	 for(int i : arr)
	 {
		 System.out.print(i+" ");
	 }
	 
	 System.out.println();
	 
	 for(int i=arr.length-1; i>=0; i--)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println();
	 
	 String [] str=new String[] {"mayuri","shital","rahul","sanika","vitthal","mayur"};
	 
	 for(String i : str)
	 {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 
	 for(int i=str.length-1; i>=0; i--)
	 {
		 System.out.print(str[i]+" ");
	 }
	 
   }
}
