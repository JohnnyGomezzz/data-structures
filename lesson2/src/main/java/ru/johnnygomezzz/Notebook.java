package ru.johnnygomezzz;

import java.util.Random;

public class Notebook {
    Random random = new Random();

    private int price;
    private int ram;
    private String brand;

    public Notebook(int price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    public Notebook() {
    }

    public int getPrice() {
        return price;
    }

    public void setRndPrice(int min, int max, int step) {
        int price = random.nextInt(max - min + 1) + min;
        this.price = price - price % step;
    }

    public int getRam() {
        return ram;
    }

    public void setRndRam(int min, int max, int step) {
        int ram = random.nextInt(max - min + 1) + min;
        this.ram = ram - ram % step;
    }

    public String getBrand() {
        return brand;
    }

    public void setRndBrand(String[] brand) {
        int rndBrand = random.nextInt(brand.length);
        this.brand = brand[rndBrand];
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                '}';
    }
}
