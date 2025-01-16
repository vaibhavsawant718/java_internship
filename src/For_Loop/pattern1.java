package For_Loop;

//import java.util.Iterator;

public class pattern1 {

	public static void main(String[] args) 
	
	{
		int n=4;
		for (int row = 1; row <=n; row++)
		{
			System.out.println("s");
			for (int col = 1; col <=row; col++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
}

