package Projects;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the Operator");
			char op=in.next().trim().charAt(0);
			
			if(op=='+'|| op=='-' || op=='*' || op=='/' || op=='%')
			{
				System.out.println("Enter Two Numbers");
				int num1=in.nextInt();
				int num2=in.nextInt();
				if(op=='+')
				{
					int num3=num1+num2;
					System.out.println("the addition operation performed : " +num3);
				}
				if(op=='-')
				{
					int num3=num1-num2;
					System.out.println("the subtraction operation performed : " +num3);
				}
				if(op=='*')
				{
					int num3=num1*num2;
					System.out.println("the Multiplication operation performed : " +num3);
				}
				if(op=='/')
				{
					if(num2 !=0)
					{
					double num3=num1/num2;
					System.out.println("the division operation performed : " +num3);
					}
					else 
					{
						System.out.println("error: 0 cant divdable");
					}
				}
				if(op=='%')
				{
					int num3=num1%num2;
					System.out.println("the Percentile operation performed : " +num3);
				}
			}
			else if(op=='x' || op=='X')
			{
				break;
			}
			else
			{
				System.out.println("Invalid Operator");
			}
			
			
		}
		
	}

}
