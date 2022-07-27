package logical_programs;
//Program to find duplicate char in string
public class duplicate_char_instring 
{
   public static void main(String[] args) 
   {
	   String str="aahhdshgfeuksjjjj";
		
		char[] arr=str.toCharArray();
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}

   }
}
