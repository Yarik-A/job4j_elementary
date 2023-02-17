package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 1;
        double totalToPay = amount + amount * percent / 100;
        while (totalToPay > salary) {
            double remains = totalToPay - salary;
            totalToPay = remains + remains * percent / 100;
            year++;
        }
        return year;
    }
}
