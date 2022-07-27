package polymorphism;

public class example1	//COMPILE TIME POLYMORPHISM
{
	public void m1()  //method declaration:-> store in heap area
	{
		System.out.println("non static method"); //method definition:-> store in method area
	}
	public void m1(int a)
	{
		System.out.println(a);
	}
	public void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		example1 obj=new example1();
		obj.m1();  //binding of method declaration and definition
		obj.m1(20);
		obj.m1(30,40);
	}

}
