import java.util.Scanner;

public class Neon 
{
	public static void main(String [] args)
	{System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int square= n*n;
	while(square!=0)
	{	
		int digit= digit%10;
		sum=sum+digit;
		square=square/10;
		
	}
	if(n==sum)
     System.out.println(n+"Is a neon number");
	else 
	System.out.println(n+"is not a neon number");
	
	}
}