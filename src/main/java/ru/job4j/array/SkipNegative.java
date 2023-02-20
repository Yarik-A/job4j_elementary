package ru.job4j.array;

public class SkipNegative {

    public static int[][] skip(int[][] array) {
        for (int[] row : array) {
            for (int cell = 0;  cell < row.length; cell++) {
                if (row[cell] < 0) {
                    row[cell] = 0;
                }
            }
        }
        return array;
    }
}
