package org.example.seminar_1.cw_2;
import org.example.seminar_1.cw_2.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        WaterVendingMachine machine = new WaterVendingMachine(list);

        list.add(new Water("water1", 50.00, 1));
        list.add(new Water("water1", 50.00, 1));
        list.add(new Water("water2", 55.00, 2));
        list.add(new Water("water2", 65.00, 2));

        Water water = machine.getProduct("water1", 1);
        System.out.println(machine.getProduct("water1", 1));

/**
 * Д/З семинар 1
 */
        List<Product> list1 = new ArrayList();
        HotDrinkVendingMachine machine1 = new HotDrinkVendingMachine(list1);

        list1.add(new HotDrink("tea", 15.00, 70, 1));
        list1.add(new HotDrink("tea", 15.00, 70, 1));
        list1.add(new HotDrink("coffee", 45.00, 65, 1));
        list1.add(new HotDrink("coffee", 65.00, 80, 1));

        HotDrink hotDrink = machine1.getProduct("tea", 70, 1);
        System.out.println(machine1.getProduct("tea", 70, 1));
    }
}
