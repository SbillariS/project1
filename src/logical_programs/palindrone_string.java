package logical_programs;

public class palindrone_string
{
	public static void main(String[] args) 
	   {
		//Java program to check the given string is Palindrome string
		String str="mam";
		String str1="";
		for(int i=str.length()-1; i>=0; i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println("original string : "+str);
		System.out.println("Reverse string : "+str1);
	   
	   if(str.equalsIgnoreCase(str1))
	   {
		   System.out.println(str+ " is palindrone string");
	   }
	   else
	   {
		   System.out.println(str1+ " is not palindrone string");
	   }
	   }
}
