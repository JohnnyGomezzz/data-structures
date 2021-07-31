package ru.johnnygomezzz;

import java.util.Random;

public class ConsistentArray {
    private int length;

    public ConsistentArray(int length) {
        this.length = length;
    }

    public Integer[] getArray() {
        Random random = new Random();

        Integer[] consistentArray = new Integer[length];

        //todo Разобраться, почему при рандоме=1 не удаляет из массива 1

        int rndElement = random.nextInt(length - 1 + 1) + 1;
        int cnt = 1;

        System.out.println(rndElement);

        for (int i = 0; i < consistentArray.length; i++) {
            consistentArray[i] = cnt;
            if (consistentArray[i] == rndElement - 1) {
                cnt = rndElement;
            }
            cnt++;
            }
        return consistentArray;
    }
}
