import java.util.Scanner;
public class RangeEvenOdd 
{
 public static void main(String[] args)
 { 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("From Range:");
	 int n=sc.nextInt();
	 int num=1;
	 int m=1;

	
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			  if (num<=5)
				  System.out.print(num++);
			  else
				  System.out.print(m++);
				  
		 }
		System.out.println();
		
	 }
 }
}
