package logical_programs;

public class reverse_string 
{
  //Java program to reverse string.
	public static void main(String[] args) 
	   {
		String str="Good Morning";
		String str1="";
		for(int i=str.length()-1; i>=0; i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println("original string : "+str);
		System.out.println("Reverse string : "+str1);
	   }
}
