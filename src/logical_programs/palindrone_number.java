package logical_programs;
//Java program to check the given number is Palindrome Number
public class palindrone_number 
{
	 public static void main(String args[])
	 {
		 int rem,rev=0,num=121;
		 int p=num;
		 while(num!=0)
		 {
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
		 System.out.println(rev);
		 if(p==rev)
		 {
			System.out.println("the given number is palindrone " +rev); 
		 }
		 else
		 {
			 System.out.println("the given number is not palindrone" +rev);
		 }
	 }
	   

}
