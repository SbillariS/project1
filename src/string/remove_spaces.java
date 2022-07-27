package string;

public class remove_spaces
{
  public static void main(String[] args)
  {
	String str=" shital is a good girl ";
	System.out.println(str.replaceAll(" ", ""));
	System.out.println(str.trim());
  }
}
