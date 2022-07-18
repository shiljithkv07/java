import java.util.Scanner;
public class Armstrong 
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the desired number:");
		int count=0;
		int num= sc.nextInt();
		int num1=num;
		int original_num=num1;
	
		while(num>0)
		{
			num/=10;
			count++;
		}
		while(num1>0)
		{
			int last=num%10;
			int prod=1;
			for(int i=1;i<=couunt;i++)
			{
				prod*=last;
			}
			sum+=prod;
			num1=num1/10;
		}
		if(sum==original_num)
		{
			System.out.println("Armstrong number");
		}
		else 
		System.out.println("not a armstrong");
	}
	
}
