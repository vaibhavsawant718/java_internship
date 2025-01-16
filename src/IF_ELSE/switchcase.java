package IF_ELSE;

public class switchcase {
    public static void main(String[] args) {
        
        int num = 3; 
        int a = 25, b = 25;  

        // Case 1: Even or Odd
        switch (num % 2) {
            case 0:
                System.out.println("The number is Even.");
                break;
            case 1:
                System.out.println("The number is Odd.");
                break;
        }

        // Case 2: Greater among a and b
        switch (Integer.compare(a, b)) {
            case 1:
                System.out.println("The greater number is: " + a);
                break;
            case -1:
                System.out.println("The greater number is: " + b);
                break;
            default:
                System.out.println("Both numbers are equal.");
        }

        // Case 3: Positive or Negative
        switch (Integer.signum(num)) {
            case 1:
                System.out.println("The number is Positive.");
                break;
            case -1:
                System.out.println("The number is Negative.");
                break;
            default:
                System.out.println("The number is Zero.");
        }
    }
}
