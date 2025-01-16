package IF_ELSE;


public class check_quadrants {
    public static void main(String[] args)
    {
    	int x=-10;
    	int y=1;
    	
    	if(x>0 && y>0)
    	{
    		System.out.println("The First Quadrant");
    	}
    	else if(x<0 && y>0)
    	{
    		System.out.println("The Second Quadrant");
    	}
    	if(x<0 && y<0)
    	{
    		System.out.println("The Third Quadrant");
    	}
    	if(x>0 && y<0)
    	{
    		System.out.println("The Fourth Quadrant");
    	}
    	
    }
}
 