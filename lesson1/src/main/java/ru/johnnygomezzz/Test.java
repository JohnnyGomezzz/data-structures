package ru.johnnygomezzz;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void exampleA() {
        int n = 10000;
        int sum = 0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                arrayList.add(i * j);
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void exampleB() {
        int n = 10000;
        int sum = 0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i += 2) {
            for (int j = i; j < n; j++) {
                arrayList.add(i * j);
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void exampleC() {
        int n = 10000;
        int sum = 0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                arrayList.add(i * j);
                n--;
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static BigInteger exampleDFactorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return n;
        }
        return n.multiply(exampleDFactorial(n.subtract(BigInteger.valueOf(1))));
    }

    public static BigInteger exampleEFib(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ZERO;
        }
        if (n.equals(BigInteger.TWO)) {
            return BigInteger.ONE;
        }
        return exampleEFib(n.subtract(BigInteger.ONE)).add(exampleEFib(n.subtract(BigInteger.TWO)));
    }

    public static void main(String[] args) {
        // exampleA();
        // exampleB();
        // exampleC();
        // System.out.println(exampleDFactorial(BigInteger.valueOf(10000)));
        System.out.println(exampleEFib(BigInteger.valueOf(40)));
    }
}
