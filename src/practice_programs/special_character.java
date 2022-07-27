package practice_programs;

public class special_character {

	public static void main(String[] args) 
	{
       String str="sasjsjj2q8w2djkj##@^@*WIW@WH88ijjjsoHSdkdsk5845dsd5fhhhasssh267623&^&&&27^&82u2uhjsdG55^*I*D*SS$@Y&J";
      String str1= str.replaceAll("[a-zA-Z0-9]", "");
      System.out.println(str1);
      System.out.println(str1.length());
      
      String str2=str.replaceAll("[0-9!@#$%^&*]", "");
        System.out.println(str2);
        System.out.println(str2.length());
        
        String str3=str.replaceAll("[a-zA-Z!@#$%^&*]", "");
         System.out.println(str3);
         System.out.println(str3.length());
         
         String str4=str.replaceAll("[a-z0-9!@#$%^&*]", "");
         System.out.println(str4);
         System.out.println(str4.length());
         
         String str5=str.replaceAll("[A-Z0-9!@#$%^&*]", "");
         System.out.println(str5);
         System.out.println(str5.length());
	}

}
