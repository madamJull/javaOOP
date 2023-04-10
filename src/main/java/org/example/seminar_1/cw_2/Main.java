package org.example.seminar_1.cw_2;
import org.example.seminar_1.cw_2.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        list.add(new Water("a", 50.00, 1));
        list.add(new Water("b", 55.00, 1));
        list.add(new Water("b", 55.00, 2));
        list.add(new Water("b", 55.00, 2));
        WaterVendingMachine machine = new WaterVendingMachine(list);

        Water water = machine.getProduct("a", 1);

        System.out.println(machine.getProduct("a", 1));
    }
}
