package LLD.ShoppingDiscount_Imp;

// Step 2: Implement a BasicProduct class that represents a product without any discounts
class BasicProduct implements Product {
    private double price;
    private String description;

    public BasicProduct(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
