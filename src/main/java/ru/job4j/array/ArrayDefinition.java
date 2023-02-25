package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan Kog";
        names[1] = "Nikolay Fedotov";
        names[2] = "Elena Vorobey";
        names[3] = "Irina Krot";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
