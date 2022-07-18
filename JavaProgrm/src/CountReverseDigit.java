import java.util.Scanner;
public class CountReverseDigit 
{
   public static void main(String[] args)
   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the number of choice:");
	   int num=sc.nextInt();
	   int count=0;
	   while(num>0)
	   {
		   int last=num%10;
		   //System.out.print(last);
		   num=num/10;
	   }
	   System.out.println(Integer.MIN_VALUE);
   }
}
