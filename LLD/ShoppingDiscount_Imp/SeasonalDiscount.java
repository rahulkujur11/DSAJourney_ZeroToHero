package LLD.ShoppingDiscount_Imp;

// Step 4: Implement specific discount classes that extend the DiscountDecorator
class SeasonalDiscount extends DiscountDecorator {
    private double discountRate;

    public SeasonalDiscount(Product product, double discountRate) {
        super(product);
        this.discountRate = discountRate;
    }

    @Override
    public double getPrice() {
        return product.getPrice() * (1 - discountRate);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " with Seasonal Discount";
    }
}
