package logical_programs;

public class reverse_number 
{
  //Java program to reverse number.
	public static void main(String args[])
	 {
		 int rem,rev=0,num=456;
		 while(num!=0)
		 {
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
		 System.out.println(rev);
	 }
}
