import java.util.Scanner;
public class RangeoddNum 
{ 
	public static void main(String[] args)
	 Scanner sc=new Scanner(System.in);
	 System.out.println("From Range:");
	 int n=sc.nextInt();
	 System.out.println("To Range:");
	 int m=sc.nextInt();
	 System.out.println("Even number are :");
	 for(int start=m;start<=n;start++)
	 {
		 if(start%2==1)
		System.out.println(start);
	 }
}
