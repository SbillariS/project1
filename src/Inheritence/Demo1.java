package Inheritence;

public class Demo1 extends Demo
{
	public Demo1() //done
	{
        System.out.println(" sub class constructor without parameter get called");
    }
	public Demo1(int a)
	{
		super(20);
		System.out.println("sub clas constuctor with parameter get called " + a);
	}
	public Demo1(int x, int y, int z)
	{
		super(80,90);
		System.out.println("sub clas constuctor with parameter get called " + x  + " " + y +" " + z);

	}
    public static void main(String[] args)
    {
		Demo1 obj=new Demo1();
		Demo1 obj1=new Demo1(10);
		Demo1 obj2=new Demo1(2,3,4);



	
	}
}
