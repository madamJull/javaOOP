package org.example.seminar_1.cw_1.model;

/**
 * Product - класс д/описания товаров: объявляю поля, создаю конструктор д/заполнения полей
 * и обращения к ним, совершаю пререгрузку метода перевода в строку для вывода списка товаров
 */
public class Product {
    private String name;
    private Double price;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
