import java.util.Scanner;
public class NaturalNum 
{
	 public static void main(String[] args)
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the starting number:");
		 int m=sc.nextInt();
		 System.out.println("Enter the last number:");
		 int n=sc.nextInt();
		 for( ;m<=n;m++)
		 {
			 if(m>0)
		 System.out.println(m);
		 }
	 }
	 
}
