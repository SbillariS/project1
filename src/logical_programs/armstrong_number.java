package logical_programs;
// Java program to check the given number is Armstrong Number
public class armstrong_number 
{
	 public static void main(String args[])
	 {
		 int rem,rev=0,num=153;
		 int arm=num;
		 while(num!=0)
		 {
			 rem=num%10;
			 rev=rev+rem*rem*rem;
			 num=num/10;
		 }
		 System.out.println(rev);
		 if(arm==rev)
		 {
			System.out.println("the given number is armstrong "+rev); 
		 }
		 else
		 {
			System.out.println("the given number is not armstrong "+rev); 
         }
	 }
}
