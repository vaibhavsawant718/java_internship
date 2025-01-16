package IF_ELSE;

public class ifelseprofit 
{
	public static void main(String[] args) 
	{
		int actualprice=1000;
		int selllingprice=2000;
		//int selllingprice=500;
		//int selllingprice=1000; 
		if(selllingprice>actualprice)
		{
			int profit=selllingprice-actualprice;
			System.out.println("the profit is:"+profit);
		}
		else if(selllingprice<actualprice)
		{
			int loss=selllingprice-actualprice;
			System.out.println("The loss is:"+loss);
		}
		else
		{
			System.out.println("No Profit No Loss");
			
		}
	}
}
