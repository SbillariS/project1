package practice2;

public class star_alphabet 
{
	 public static void main(String[] args)
	   {
	        char s='A';
			for(int i=1; i<=5; i++)
			{
			   for(int j=1; j<=i; j++)
			   {
				  System.out.print( " "+s); 
				  s++;
			   }
	            System.out.println();
		     }
	   
	   }
}
