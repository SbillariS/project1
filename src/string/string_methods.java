package string;

public class string_methods
{
   public static void main(String[] args)
   {
	 // 1: Length-> size of string
	   String str=" good morning ! how are you ";
	   System.out.println(str.length());
	   
	 // 2: equals -> check the equality of two string case and content
	   String str2="shital";
	   String str3="Shital";
	   String str4="shital";
	   System.out.println(str2.equals(str3));
	   System.out.println(str2.equals(str4));
	   
	 // 3: equalIngoreCase 
	   System.out.println(str2.equalsIgnoreCase(str3));
	   System.out.println(str2.equalsIgnoreCase(str4));
	   
	 // 4: charAt(index):
	   System.out.println(str.charAt(7));
	   
	 // 5: toUppercase() and toLowercase()
	   System.out.println(str.toUpperCase());
	   System.out.println(str.toLowerCase());
	   
	 // 6: concat()
	   System.out.println(str.concat(str2));
	   
	 // 7: trim()
	   System.out.println(str.trim());
	   
	 // 8: contains()
	   System.out.println(str.contains("how"));
	   
	 // 9: startswith()
	   System.out.println(str.startsWith(" good"));
	   
	 // 10: endswith()
	   System.out.println(str.endsWith(" "));
	   }
}
