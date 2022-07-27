package Array;

public class string_array 
{
     public static void main(String[] args)
     {
		 String [] str= new String[4];
		 
		 str[0]="shital";
		 str[1]="uma";
		 str[2]="kamini";
		 str[3]="ashwini";
		 
		 for(String i : str)
		 {
			 System.out.println(i);
		 }
		 for(int j=0; j<=3; j++)
		 {
			 System.out.print(str[j]+" ");
		 }
		 
	 }
}
