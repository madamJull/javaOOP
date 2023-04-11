package org.example.seminar_1.cw_2.model;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int temperature, int volume){
        for(Product product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemperature() == temperature && ((HotDrink) product).getVolume() == volume) {
                    return (HotDrink) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
