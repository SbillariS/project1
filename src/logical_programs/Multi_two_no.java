package logical_programs;

public class Multi_two_no 
// multiplication of two number without using *
{
        public static void main(String[] args) 
        {
			int n1=2,n2=4;
			int n3=0;
			for(int i=1; i<=n2; i++)
			{
				n3=n3+n1;//2,4,6,8
			}
			System.out.println(n3);
		}
}