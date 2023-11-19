package controllers;

import entities.Order;
import entities.PickupOrder;
import entities.ShippingOrder;
import views.AppView;

public class AppController {
    private final AppView appView = new AppView();
    private final static String CURRENCY = "USD";
    Order order;


    public void getPayment() {
        String[] data = appView.getInput();
        double productPrice = Double.parseDouble(data[0]);
        int productQuantity = Integer.parseInt(data[1]);
        String deliveryType = data[2];


        if (deliveryType.equals("d")) {
            order = new ShippingOrder(productPrice, productQuantity, 10);
        } else {
            order = new PickupOrder(productPrice, productQuantity);
        }

        String output = "Total price is " + CURRENCY + " " + order.getTotalPrice();
        appView.getOutput(output);
    }
}
