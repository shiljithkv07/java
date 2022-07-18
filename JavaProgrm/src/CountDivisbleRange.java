import java.util.Scanner;
public class CountDivisbleRange 
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int m=sc.nextInt();
		System.out.println("Enter the last number:");
		int n=sc.nextInt();
		int count=0;
		for( ;m<=n;m++)
		{
			if(m%3==0&&m%7==0)
				count++;
		}
	System.out.println("The no. of digits divisible by 3 & 7 are:"+count);
	System.out.println("The no. of digits divisible by 3 & 7 are:"+count);
	}
	
}
