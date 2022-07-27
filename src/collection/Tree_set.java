package collection;

import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args)
	{
        TreeSet <String> t=new TreeSet<String>();
        
        t.add("india");
        t.add("bhutan");
        t.add("red");
        t.add("shital");
        t.add("india"); //ingore
      //  t.add(null);
      //  t.add(30);
        System.out.println(t);
        
      //  print decending order
        System.out.println(t.descendingSet());

      //remove 
        t.remove("red");
        System.out.println(t);
	}

}
