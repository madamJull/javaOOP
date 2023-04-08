package org.example.seminar_1.cw_1.model;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> list;

    /**
     * Контсруктор д/инициализации пременной list
     */
    public VendingMachine() {
        list = new ArrayList<Product>();
    }

    /** Заполнение списка продуктов
     * @param newItem
     */
    public void addProduct(Product newItem){
        list.add(newItem);
    }

    /** Перебор списка продуктов по определенному параметру
     * @param searchName
     * @return результат поиска
     */
    public ArrayList getProductByName(String searchName){
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list){
            if(item.getName().contains(searchName)){
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getProductByPrice(Double searchPrice){
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list){
            if(item.getPrice().equals(searchPrice)){
                result.add(item);
            }
        }
        return result;
    }
}
