package ru.johnnygomezzz;

import java.util.Arrays;
import java.util.Random;

public class ConsistentArray {

    public static Integer[] create(int length) {
        Random random = new Random();

        Integer[] consistentArray = new Integer[length];
        int rndElement = random.nextInt((length - 1) + 1);
        int cnt = 1;
        System.out.println(rndElement);

        for (int i = 0; i < consistentArray.length; i++) {
            consistentArray[i] = cnt;
            if (consistentArray[i] == rndElement - 1) {
                cnt++;
            }
            cnt++;
            }
        return consistentArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(create(5)));
    }
}
