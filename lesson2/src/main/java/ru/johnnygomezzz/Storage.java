package ru.johnnygomezzz;

import java.util.Arrays;
import java.util.Random;

public class Storage {

    public static void main(String[] args) {

        Random random = new Random();

        Notebook[] notebooks = new Notebook[100];

        String[] brand = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

        for (int i = 0; i < notebooks.length; i++) {
            int price = random.nextInt(1000 - 500 + 1) + 500;
            int price100 = price - price % 100;

            int ram = random.nextInt(12 - 4 + 1) + 4;
            int ram4 = ram - ram % 4;

            int rndBrand = random.nextInt(5);

            Notebook notebook = new Notebook(price100, ram4, brand[rndBrand]);

            notebooks[i] = notebook;
        }

        Boolean isChange;
        int min = 0;
        do {
            isChange = false;
            for (int i = 0; i < notebooks.length - 1; i++) {
                if (notebooks[i].getPrice() > notebooks[i + 1].getPrice()) {
                    Notebook temp = notebooks[i];
                    notebooks[i] = notebooks[i + 1];
                    notebooks[i + 1] = temp;
                    isChange = true;
                }
                if (notebooks[i].getPrice() == notebooks[i + 1].getPrice()
                && notebooks[i].getRam() > notebooks[i + 1].getRam()) {
                    Notebook temp = notebooks[i];
                    notebooks[i] = notebooks[i + 1];
                    notebooks[i + 1] = temp;
                    isChange = true;
                }
//                if (notebooks[i].getPrice() == notebooks[i + 1].getPrice()
//                        && notebooks[i].getRam() == notebooks[i + 1].getRam()) {
//                    while (notebooks[i].getBrand().equals(brand[min])) {
//                        Notebook temp = notebooks[i];
//                        notebooks[i] = notebooks[i + 1];
//                        notebooks[i + 1] = temp;
//                    }
//                    min++;
//                    if (min == 4) {
//                        break;
//                    }
//                    isChange = true;
//                }
            }
        } while (isChange);

        System.out.println(Arrays.toString(notebooks));
    }
}
