package constractor;

public class Example
{
	int rollno;
	String name;
	String address;
	String clgname;
	float per;
	char grade;
	
	Example(int a,String b,String c,String d,float e,char f)
	{
	  rollno=a;
	  name=b;
	  address=c;
	  clgname=d;
	  per=e;
	  grade=f;
	}
	public void infodisplay()
	{
		System.out.println("student information");
		System.out.println("roll no= "+rollno);
		System.out.println("Name= "+name);
		System.out.println("Address= "+address);
		System.out.println("college name= "+clgname);
		System.out.println("percentae= "+per);
		System.out.println("Grade= "+grade);
	}
	

	public static void main(String[] args)
	{
        Example obj1=new Example(1,"shital","Risod"," BM",75.66f,'A'); 
        obj1.infodisplay();
	}

}
