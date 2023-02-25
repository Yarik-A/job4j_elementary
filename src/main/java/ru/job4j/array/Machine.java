package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int totalChange = money - price;
        if (totalChange > 0) {
            for (int coin : coins) {
                while (totalChange >= coin) {
                    rsl[size] = coin;
                    totalChange -= coin;
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
