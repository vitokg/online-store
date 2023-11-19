package entities;

public class ShippingOrder implements Order {
    private double productPrice;
    private int quantity;
    private double shippingFee;

    public ShippingOrder(double productPrice, int quantity, double shippingFee) {
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.shippingFee = shippingFee;
    }

    @Override
    public double getTotalPrice() {
        return this.productPrice * this.quantity + calculateShippingPrice();
    }

    private double calculateShippingPrice() {
        return (this.productPrice * this.quantity) * (this.shippingFee/100);
    }
}
