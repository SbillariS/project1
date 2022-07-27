package practice_programs;

public class Reverse2 
{
	public static void main(String[] args) 
	{
   	 int rem, rev=0, num=234;
   	 do
   	 {
 		rem=num%10;//4,3,2
 		rev=rev*10+rem;//4,3,2
 		num=num/10;//23,2,0

   	 }
   	 while(num!=0);
   	 System.out.println(rev);

	}

}
