package ru.johnnygomezzz;

import java.util.Arrays;

public class FindLostElement {
    public static ConsistentArray consistentArray = new ConsistentArray(10);

    public static void main(String[] args) {
        Integer[] array = consistentArray.getArray();
        System.out.println(Arrays.toString(array));
    }

//    public Integer find(Integer[] array) {
//        return lostElement;
//    }
}
