package practice_programs;

public class swap_with3rd_variable
{
     public static void swap(int num1,int num2)
     {
    	 int num3;
    	 num3=num1;//10
    	 num1=num2;//20
    	 num2=num3;//10
    System.out.println("after swappng value of num1=" +num1+ " and value of num2=" +num2);
     }
     public static void main(String[] args) 
     {
		swap(10,20);
	 }
}
