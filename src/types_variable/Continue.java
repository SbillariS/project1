package types_variable;

public class Continue
{
    public static void main(String[] args)
    {
		for(int i=1; i<=7;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
