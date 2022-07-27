package types_variable;


public class global_variable
{
	static int a=5;
	public static void m1()
	{
		System.out.println(a);
	}
	public void m2() 
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		System.out.println(a);
		m1();
		global_variable obj=new global_variable();
		obj.m2();
		types obj5= new types();
		obj5.m2();
		
		obj5.m3();
	}
    
}
