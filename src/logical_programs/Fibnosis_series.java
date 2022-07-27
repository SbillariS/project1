package logical_programs;

public class Fibnosis_series
{
	//Java program to calculate fibonacci series
  public static void main(String[] args) 
  {
	int n1=1,n2=2,n3;
	System.out.print(n1+" "+n2);
	for(int i=1;i<=5; i++)
	{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}
  }
}
