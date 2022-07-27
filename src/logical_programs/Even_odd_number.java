package logical_programs;

public class Even_odd_number
{
	public static void main(String[] args)
	{
    // Java program to print 0 to 100 even/odd number 
       for(int i=1; i<=100; i++)
       {
         if(i%2!=0)//(i%2==0) for even
         {
        	System.out.println(i+" is a odd numbers");  
         }
       }
	}
}
