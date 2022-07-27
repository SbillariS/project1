package logical_programs;
//Java program to calculate factorial of a number 
public class factorial_number 
{
	 public static void main(String[] args) 
     {
    	 int fact=1;
		for(int i=3; i>=1;i--)
		{
		  fact=fact*i;
		}
		System.out.println(fact);
	 }
}
