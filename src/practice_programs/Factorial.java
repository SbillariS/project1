package practice_programs;

public class Factorial
{
    public static void main(String[] args)
    {
		int fact=1;
		int i=7;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("factorial of 7 is " +fact);
	}
}
