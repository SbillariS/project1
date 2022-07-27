package types_variable;

public class Globle_local 
{
    int Rollno;
    int Eng;
    int Maths;
    int Sci;
    static String school="high school";
    
    public static void main(String[] args) 
    {
    	Globle_local shital=new Globle_local();
    	Globle_local rahul=new Globle_local();
    	Globle_local mayuri=new Globle_local();
    	
    	school="college";
    	
    	shital.Rollno=1;
    	shital.Eng=70;
    	shital.Maths=80;
    	shital.Sci=90;
    	
    	rahul.Rollno=2;
    	rahul.Eng=75;
    	rahul.Maths=80;
    	rahul.Sci=85;
    	
    	mayuri.Rollno=3;
    	mayuri.Eng=60;
    	mayuri.Maths=65;
    	mayuri.Sci=75;
    	
    	System.out.println("shital got marks for English, Mathematics, Science= "+shital.Rollno+ ", "+shital.Eng+ ", "+shital.Maths+ " ,"+shital.Sci+ " = "+school);
    	System.out.println("rahul got marks for English, Mathematics, Science= "+rahul.Rollno+ ", "+rahul.Eng+ ", "+rahul.Maths+ " ,"+rahul.Sci+" = "+school);
    	System.out.println("mayuri got marks for English, Mathematics, Science= "+mayuri.Rollno+ ", "+mayuri.Eng+ ", "+mayuri.Maths+ ", "+mayuri.Sci+ " = "+school);


    	
	}
}
