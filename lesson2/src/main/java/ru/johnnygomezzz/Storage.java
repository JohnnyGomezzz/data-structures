package ru.johnnygomezzz;

import java.util.Random;

public class Storage {

    public static void main(String[] args) {

        Random random = new Random();

        Notebook[] notebooks = new Notebook[5000];

        for (int i = 0; i < notebooks.length; i++) {
            int price = (random.nextInt((1000 - 500) + 1) + 500);
            int price100 = price - price % 100;

            int ram = random.nextInt(12 - 4 + 1) + 4;

            String[] brand = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};
            int rndBrand = random.nextInt(5);

            Notebook notebook = new Notebook(price100, ram, brand[rndBrand]);

            notebooks[i] = notebook;

            System.out.println(notebooks[i].toString());
        }
    }
}
