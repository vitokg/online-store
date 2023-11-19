package views;

import java.util.Locale;
import java.util.Scanner;

public class AppView {

    private Scanner scanner = new Scanner(System.in);

    public String[] getInput() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Enter product price: ");
        String productPrice = scanner.next().trim();

        System.out.println("Enter product quantity: ");
        String productQuantity = scanner.next().trim();

        System.out.println("Delivery or Pickup (d/p):");
        String deliveryType = scanner.next().trim();

        scanner.close();
        return new String[]{productPrice, productQuantity, deliveryType};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
