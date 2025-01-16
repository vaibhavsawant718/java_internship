public class ProfitLoss {
    public static void main(String[] args) {
        int sellingPr = 1000;
        int actualP = 2000;  
 
        int profit = sellingPr - actualP;
        int loss = actualP - sellingPr;  
 
        System.out.println("Profit: " + profit);
        System.out.println("Loss: " + loss);
    }
}