import java.util.Scanner;
public class Perfectfactorial 
{
 public static void main(String[] args)
 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the desired number wanted:");
	int num= sc.nextInt();
	 boolean flag= false;
	 for(int i=1;i<=num/2;i++)
	 {
		 if(i*i==num)
		 {
			 flag=true;
			break;
		 }
	 }
	 if(flag)
	 {
		 System.out.println("It is a perfect square:");
	 }
	 else 
	 {
		 System.out.println("The given number is not a perfect square:");
	 }
 }
 
 
}
