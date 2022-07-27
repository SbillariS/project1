package types_variable;

public class local_Ex1 
{
	int v1=10;
	static int v2=20;
	
    public void m1() 
    {
    	int s1=8;
    	System.out.println(s1);
    	System.out.println(v1);
    	System.out.println(v2);

    }
    public static void m2()
    {
    	int s2=7;
    	System.out.println(s2);
    	local_Ex1 obj2=new local_Ex1();
    	System.out.println(obj2.v1);
    	System.out.println(v2);
    }
    public static void main(String[] args)
    {
		m2();
		local_Ex1 obj1=new local_Ex1();
		obj1.m1();
		int s3=6;
		System.out.println(s3);
		local_Ex1 obj3=new local_Ex1();
        System.out.println(obj3.v1);
        System.out.println(v2);

	}
    
}
