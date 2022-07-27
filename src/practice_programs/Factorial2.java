package practice_programs;

public class Factorial2 
{
     public static void main(String[] args)
     {
    	 int fact=1;
    	 int i=7;
    	 do
    	 {
    		 fact=fact*i;//7 6 5 4 3 2 1
    		 i--;//6 5 4 3 2 1
    		 
    	 }
    	 while(i>=1);
    	 {
    		 System.out.println(fact);

    	 }
		
	 }
}
