package DSA.Questions_1_300.Question7;

public class BuyAndSell {

    public static void main(String[] args) {
        int []ar = {1,7, 6, 4, 3, 1};
        int result = findProfit(ar);
        System.out.println(result);
    }

    public static int findProfit(int[] ar){
        if (ar.length < 2) {
            return 0; // No profit if there are less than 2 prices
        }

        int minPrice = ar[0];
        int maxProfit = 0;

        for (int i = 1; i < ar.length; i++) {
            // Calculate profit if we sold at current price
            int currentProfit = ar[i] - minPrice;
            // Update maxProfit if currentProfit is greater
            maxProfit = Math.max(maxProfit, currentProfit);
            // Update minPrice if current element is lower than minPrice
            minPrice = Math.min(minPrice, ar[i]);
        }

        return maxProfit;
    }
}
