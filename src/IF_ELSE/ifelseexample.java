package IF_ELSE;

public class ifelseexample 
{
	public static void main(String[] args)
	{
		int a=20 , b=20;
		int num=0;
		
		//check weather given no is Odd or Even
		if (num ==0) {
			System.out.println("Cant Specify");
		}
		else if(num %2 ==0)
		{
			System.out.println("The given num is Even");
		}
		else {
			System.out.println("The given num is odd");
		}
		
		//check weather which no is greater among other
		
		if(a>b)
		{
			System.out.println("The a = " +a+ " is greater than b = "+b);
		}else if(a<b)
		{
			System.out.println("The b = " +b+  " is greater than a = " +a);
		}
		else
		{
			System.out.println("The Both a = " +a+ " and b = "+b+"are same");
		}
		
		//check weather given number is Postive or Negative
		
		if(num >= 0)
		{
			System.out.println("the number is postive");
		}
		else
		{
			System.out.println("the number is negative");
		}
	}

}
