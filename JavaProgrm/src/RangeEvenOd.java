import java.util.Scanner;
public class RangeEvenOd 
{
	public static void main(String [] args)
	{
	 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the first number:");
	 int m=sc.nextInt();
	 System.out.println("Enter the last number:");
	 int n=sc.nextInt();
	 for(int start=m;start<n;start++)
	 	{
		if(start%2==0)
			System.out.println(start);	 	
		}
	 }
}
