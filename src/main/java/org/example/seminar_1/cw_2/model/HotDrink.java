package org.example.seminar_1.cw_2.model;

public class HotDrink extends Product{
    private int temperature;
    private  int volume;
//    public HotDrink(String name, Double price, int temperature) {
//        super(name, price);
//        this.temperature = temperature;
//    }

    public HotDrink(String name, Double price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                "temperature=" + temperature +
                ", volume=" + volume +
                ", price=" + super.getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) obj;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getPrice() == that.getPrice()
                && getTemperature() == that.getTemperature()
                && getVolume() == that.getVolume();
    }
}
