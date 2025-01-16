package IF_ELSE;


public class Divisiblitycheck {
    public static void main(String[] args) {
        // Hardcoded value
        int num = 15;  // Change this number to test

        if (num % 15 == 0) {
            System.out.println("The number is divisible by 3 and 5 => Java Language");
        } else if (num % 3 == 0) {
            System.out.println("The number is divisible by 3 => Java");
        } else if (num % 5 == 0) {
            System.out.println("The number is divisible by 5 => Language");
        } else {
            System.out.println("The number is not divisible by 3 or 5.");
        }
    }
}
