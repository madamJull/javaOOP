package org.example.seminar_1.cw_2.model;

public class Water extends Product {
    private int volume;

    public Water(String name, Double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + super.getName() + '\'' +
                "volume='" + this.volume + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Water)) {
            return false;
        }

        Water that = (Water) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getPrice() == that.getPrice()
                && getVolume() == that.getVolume();
    }
}
