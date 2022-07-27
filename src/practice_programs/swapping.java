package practice_programs;

public class swapping
{
    public static void m1(int num1,int num2)
    {
   	 //for swapping condition 
    	
   	   num1=num1+num2;
   	   num2=num1-num2;
   	   num1=num1-num2;
		System.out.println(" num1 value is " + num1 + ", num2 value is " + num2 );


	}
    public static void main(String[] args)
    {
    
		m1(30, 40);
	
	}
}
