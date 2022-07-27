package logical_programs;

public class duplicate_string
{
  //Java program to find duplicate string in the array 
	public static void main(String[] args)
	{
		String [] str= {"shital","uma","kamini","shital","pooja","uma"};
		for(int i=0; i<=str.length-1; i++)
	      {
	         for(int j=i+1; j<=str.length-1; j++)
	         {
	            if(str[i]==str[j])
	            {
	               System.out.print(str[i]+" ");
	            }
	         }
	         System.out.println();
	      }
	}
}
