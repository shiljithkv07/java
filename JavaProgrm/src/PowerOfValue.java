import java.util.Scanner;
public class PowerOfValue 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the value:");
	 int x= sc.nextInt();
	 System.out.println("Enter the power value:");
	 int n= sc.nextInt();
	 int prod=1;
	 for(int i=1;i<=n;i++)
	 {
		 prod=prod*x;
	 }
	 System.out.println(prod);
 }
}
