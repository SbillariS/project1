package string;

public class countwhitespace
{
	//Java program to find total no. of whitespaces in string
		public static void main(String[] args) 
		{
			String str="shital billari";
		
			int count=0;
			char [] c=str.toCharArray();
			for(char s : c)
			{
				if(s=='a')
				{
					count++;
				}
			}
			System.out.println("No of a: "+count);
			
		}

}
