package LLD.ShoppingDiscount_Imp;

// Step 3: Create an abstract DiscountDecorator class that implements the Product interface
abstract class DiscountDecorator implements Product {
    protected Product product;

    public DiscountDecorator(Product product) {
        this.product = product;
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }
}