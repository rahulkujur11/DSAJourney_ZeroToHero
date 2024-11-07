package LLD.ShoppingDiscount_Imp;

class LoyaltyDiscount extends DiscountDecorator {
    private double loyaltyRate;

    public LoyaltyDiscount(Product product, double loyaltyRate) {
        super(product);
        this.loyaltyRate = loyaltyRate;
    }

    @Override
    public double getPrice() {
        return product.getPrice() * (1 - loyaltyRate);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " with Loyalty Discount";
    }
}
