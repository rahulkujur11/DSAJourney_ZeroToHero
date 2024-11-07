package LLD.ShoppingDiscount_Imp;

// Step 5: Demonstrate the use of the pattern
public class ShoppingApp {
    public static void main(String[] args) {
        Product product = new BasicProduct(100.0, "Winter Jacket");

        // Apply multiple discounts
        product = new SeasonalDiscount(product, 0.10);   // 10% Seasonal Discount
        product = new PromotionalDiscount(product, 5.0); // $5 Promotional Discount
        product = new LoyaltyDiscount(product, 0.05);    // 5% Loyalty Discount

        System.out.println("Final Price: $" + product.getPrice());
        System.out.println("Description: " + product.getDescription());
    }
}