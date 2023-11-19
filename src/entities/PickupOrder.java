package entities;

public class PickupOrder implements Order {
    private double productPrice;
    private int quantity;

    public PickupOrder(double productPrice, int quantity) {
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return this.productPrice * this.quantity;
    }
}
