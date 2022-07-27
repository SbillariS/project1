package Array;

public class Multidimentional
{
     public static void main(String[] args)
     {
		int [][] arr=new int[2][3];
		arr [0][0]=10;
		arr [0][1]=20;
		arr [0][2]=30;
		arr [1][0]=40;
		arr [1][1]=50;
		arr [1][2]=60;
		
		for(int i=0; i<=1; i++)
		{
		  for(int j=0; j<=2; j++)
		  {
			  System.out.println(arr[i][j]+" ");
		  }
		}
	 }
}
