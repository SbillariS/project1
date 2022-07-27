package constractor;

public class User_define
{
     int num1;
     int num2;
     
     User_define(int a,int b)
     {
    	 num1=a;
    	 num2=b;
     }
     public void add()
     {
    	 System.out.println(num1+num2);
     }
     public static void sub()
     {
    	 User_define obj1=new User_define(50,5);
    	System.out.println(obj1.num1-obj1.num2);
     }
     public void mul()
     {
    	System.out.println(num1*num2); 
     }
     public static void main(String[] args)
     {
    	 User_define obj2=new User_define(60,2);
    	 obj2.add();
    	 obj2.mul();
    	 User_define obj3=new User_define(80,2);
    	 obj3.sub();
 		 Default obj=new Default();
         obj.mul();

	 }
}

