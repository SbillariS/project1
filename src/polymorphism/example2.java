package polymorphism;

public class example2
{
	//COMPILE TIME POLYMORPHISM
	
	public void add(int a, int b)
	{
		System.out.println("addition of two numbers");
		System.out.println(a+b);
	}
	public void add(int x, int y, int z)
	{
		System.out.println("addition of three numbers ");
		System.out.println(x+y+z);
	}
	public void add(String Fname,String Lname)
	{
		System.out.println(Fname);
		System.out.println(Lname);
	}

	public static void main(String[] args)
	{
            example2 obj2=new example2();
            obj2.add(30, 40);
            obj2.add(10, 20, 50);
            obj2.add("SHITAL", "BILLARI");
	}

}
