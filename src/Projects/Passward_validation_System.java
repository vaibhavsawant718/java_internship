package Projects;
import java.util.Scanner;

public class Passward_validation_System 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String correctpassword="1234";
		int attempt=3;
		
		while(attempt>0)
		{
			System.out.println("Enter The Password");
			String input=scanner.nextLine();
			
			if(input.equals(correctpassword))
			{
				System.out.println("Access Granted");
				break;
			}
			else 
			{
				attempt--;
				System.out.println("Incorrect Password : "+attempt+" Remaining attempt");
			}
		}
		
		if(attempt==0)
		{
			System.out.println("Account Locked Due too many failed attempts");
			scanner.close();
		}
		
		
	}
}
