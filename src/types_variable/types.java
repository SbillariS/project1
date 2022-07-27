package types_variable;

public class types 
{
	int i=10;
    public static void m1() 
    {
    	types obj1=new types();
    	System.out.println(obj1.i);//i=10
    	
    }
    public void m2()
    {
    	i++;
    	System.out.println(i);//i=10
    	
    }
    public void m3() 
    {
    	System.out.println(i);//i=11
    }
    public static void main(String args[]) 
    {
        types obj2=new types();
    	System.out.println(obj2.i);
    	obj2.m2();
    	obj2.m3();
    }
}
