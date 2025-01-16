package IF_ELSE;

public class profitloss 
{
		public static void main(String[] args) 
		{
			int sellingprice=2000;
			int actualprice=1000;
			//for calculate the profit
			int profit=sellingprice-actualprice;
			System.out.println("the profit is :"+profit);
	
			//for calculate the loss
			sellingprice=800;
			int loss=actualprice-sellingprice;
			System.out.println("the loss is :"+loss);
	
		}
}
