package practice2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class duplicate_arrays 
{
	public static void main(String[] args) 
	{
		int [] arr= {30,89,78,30,45,20,78,20,56};
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			a.add(arr[i]);
		}
		System.out.println(a);
		
		LinkedHashSet<Integer> b= new LinkedHashSet<>(a);
		System.out.println(b);
	}
}
