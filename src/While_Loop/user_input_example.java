package While_Loop;
import java.util.Scanner;

public class user_input_example 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=0;
		
		while(number>=0)
		{
			System.out.println("Enter a Number(Negative to exit)");
			number=scanner.nextInt();
		}
		System.out.println("Loop Existed bcz you enterd Negative Number");
		scanner.close();
	}
}
