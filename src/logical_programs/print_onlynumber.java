package logical_programs;

public class print_onlynumber {

	public static void main(String[] args) 
	{
       //Java program to print only numbers from given String
		String str="shjd45hhh7mb23@#g^&hh89";
		System.out.println(str.replaceAll("[a-zA-Z!@#$%^&*]", ""));
	}

}
