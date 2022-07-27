package logical_programs;

public class prime_number {

	public static void main(String[] args) 
	{
     //Java program to check the given number is Prime Number
       int num=7;
       int a=0;
       
       for(int i=2; i<=num-1; i++)
       {
    	   if(num%i==0)
    	   {
    		    a=a+1;
    	   }
       }
       if(a==0)
       {
   		System.out.println(num+ " is a prime number");
       }
       else
       {
      		System.out.println(num+" is not a prime number");
       }
	}

}
