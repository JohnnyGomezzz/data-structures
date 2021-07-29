package ru.johnnygomezzz;

import java.util.*;

public class Storage {

    public static List<Notebook> quickSort(List<Notebook> arr) {

        if (arr.isEmpty()) {
            return arr;
        }

        Notebook base = arr.get(0);

        List<Notebook> left = new LinkedList<>();
        List<Notebook> middle = new LinkedList<>();
        List<Notebook> right = new LinkedList<>();


        for (Notebook n : arr) {
            if (n.getPrice() > base.getPrice()) {
                right.add(n);
            }
            if (n.getPrice() == base.getPrice()) {
                if (n.getRam() > base.getRam()) {
                    right.add(n);
                }
                if (n.getRam() < base.getRam()) {
                    left.add(n);
                }
                if (n.getRam() == base.getRam()) {
                    middle.add(n);
                }
            } else if (n.getPrice() < base.getPrice()) {
                left.add(n);
            }
        }

        left = quickSort(left);
        right = quickSort(right);

        left.addAll(middle);
        left.addAll(right);

        return left;
    }

    public static void sort(Notebook[] arr) {
        List<Notebook> list = Arrays.asList(arr);

        quickSort(list).toArray(arr);
    }

    public static void compareBrands(String[] brands) {

    }

    public static void main(String[] args) {

        Notebook[] notebooks = new Notebook[100];

        String[] brand = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

        for (int i = 0; i < notebooks.length; i++) {
            Notebook notebook = new Notebook();
            notebook.setRndPrice(500, 1000, 100);
            notebook.setRndRam(4, 12, 4);
            notebook.setRndBrand(brand);

            notebooks[i] = notebook;
        }

        sort(notebooks);
        System.out.println(Arrays.toString(notebooks));
    }
}
