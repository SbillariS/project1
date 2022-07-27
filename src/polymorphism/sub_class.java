package polymorphism;

public class sub_class extends SUPER
{
   public void mul(int a, int b)
   {
	   System.out.println(a*b);
   }
   public static void main(String[] args)
   {
	   sub_class c=new sub_class();
	   c.mul(10, 20, 30);
	   c.mul(40, 50);
   }
}
