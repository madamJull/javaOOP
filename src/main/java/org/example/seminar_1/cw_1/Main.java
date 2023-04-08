package org.example.seminar_1.cw_1;

import org.example.seminar_1.cw_1.model.Product;
import org.example.seminar_1.cw_1.model.VendingMachine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("snikers", 55.00));
        machine.addProduct(new Product("mars", 70.00));
        machine.addProduct(new Product("tea", 25.00));
        machine.addProduct(new Product("water", 15.00));

        ArrayList list = machine.getProductByPrice(25.00);
        System.out.println(list);
    }
}
