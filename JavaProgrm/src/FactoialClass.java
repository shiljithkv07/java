import java.util.Scanner;
public class FactoialClass 
{
	 public static void main(String [] args)
	 {
		 Sannner sc=  new Scanner(System.in);
		 System.out.println("Enter the desired number:");
		int num=sc.nextInt();
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.prrintln("Factorial is:"+fact);
		}
}
