package logical_programs;

public class whitespace
{
   public static void main(String[] args)
   {
	   //Java program to find total no. of whitespaces in string.
	 String str="dhdjdj hddh djdh jhddh jd hj j44";
	 int count=0;
	 for(int i=0; i<=str.length()-1; i++)
	 {
		 char ch=str.charAt(i);
		 if(ch==' ')
		 {
			 count++;
		 }
	 }
	 System.out.println("total white space is : "+count);

	 }
}
