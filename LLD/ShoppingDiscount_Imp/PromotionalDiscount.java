package LLD.ShoppingDiscount_Imp;

class PromotionalDiscount extends DiscountDecorator {
    private double discountAmount;

    public PromotionalDiscount(Product product, double discountAmount) {
        super(product);
        this.discountAmount = discountAmount;
    }

    @Override
    public double getPrice() {
        return product.getPrice() - discountAmount;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " with Promotional Discount";
    }
}