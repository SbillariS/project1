package practice2;

public class count {

	public static void main(String[] args)
	{
		String s="sgshgdh%^hshdh26ussh";
		String m=s.replaceAll("[a-zA-Z0-9%^]"," ");
		System.out.println(m);
		System.out.println(m.length());
	}

}
