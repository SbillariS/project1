package logical_programs;

import java.util.Arrays;
//Java program to check two arrays are equal or not
public class arrays_equality
{
    public static void main(String[] args)
    {
		int [] arr=new int[] {10,30,50,70,90,20,40,60};
		int [] arr1=new int[] {10,30,50,70,20,40,60,90};
		int [] arr2=new int[] {10,30,50,70,90,20,40,60};

		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2, arr));


	}
}
