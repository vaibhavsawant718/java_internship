package For_Loop;
//need practice
public class print1tonseries {

		public static void main(String[] args) 
		{
			int n=25;
			for(int i=0;i<=n;i++)
			{
				
				if(i%5==0&&i%3==0)
				{
					
					System.out.println("java Language"+i);
				}else if(i%5==0)
				{
					System.out.println("java"+i);
				}else if(i%3==0)
				{
					System.out.println("language"+i);
				}
			}
		}
		
}
