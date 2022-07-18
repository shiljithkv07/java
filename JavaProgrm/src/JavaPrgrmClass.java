import java.util.Scanner;
public class JavaPrgrmClass 
{
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number of wish");
			int num=sc.nextInt();
			if(num%2==0)
			System.out.println("Its a even number");
			else
			System.out.println("Its a odd number");
		}

}
