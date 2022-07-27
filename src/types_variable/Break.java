package types_variable;

public class Break
{
   public static void main(String[] args)
   {
	    for(int i=1; i<=20;i++)
	    {
	       System.out.println(i);
	       if(i==5)
	    	   break;
	    }
	    System.out.println("loop stopped");
   }
}
