package constractor;

public class Default
{
	int num1;
	int num2;
	Default()
	{
	    num1=10;
	    num2=20;
	}
	
	 public void mul()
	 {
		 System.out.println(num1*num2);
	 }
	 public static void add()
	 {
			Default obj1=new Default();
           
		 System.out.println(obj1.num1+obj1.num2);
	 }
     public static void main(String[] args)
     {
		Default obj=new Default();
		obj.mul();
		add();
	 }
}
