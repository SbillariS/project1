package string;

public class string_metods2
{
  public static void main(String[] args) 
  {
	// 11: isEmpty
	  String str="";
	  String str1=" ";
	  String str2="hello everyone!";
	  System.out.println(str.isEmpty()+" "+str1.isEmpty()+" "+str2.isEmpty());
	  
	// 12: indexof
	  String str3="shital, mayuri, rahul, snehal, vedant, rupali, snehal";
	  System.out.println(str3.indexOf('y'));
	  System.out.println(str3.indexOf("vedant"));
	  
	// 13: lastIndexof()
	  System.out.println(str3.lastIndexOf('i'));
	  System.out.println(str3.lastIndexOf("snehal"));
	  
	// 14 : to char array()
	  char [] arr=str2.toCharArray();
	  for(char i : arr)
	  {
		  System.out.println(i+" ");
	  }
	  
	// 15 : split()
	  String [] s=str3.split("l");
	  for(String i : s)
	  {
		  System.out.println("\n"+i);
	  }
	  
	// 16 : substring()
	  String str4=" Good Evening! Welcome to today's class we are going to study String methods";
	  String a=str4.substring(15,40);
	  System.out.println(a);
	  
	// 17 : Replace()
	  String s1=str2.replace('e', 'a');
	  System.out.println(s1);
	
	// 18 : ReplaceFirst()
	  String s2=str2.replace('o', 'z');
      System.out.println(s2);
      
    // 19 : ReplaceAll()
		String s3=str3.replaceAll("[^0-9]","");
		System.out.println(s3);
	  }
}
