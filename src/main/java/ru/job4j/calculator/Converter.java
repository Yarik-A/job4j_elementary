package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(240);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("240 rubles are " + dollar + " dollars.");
    }
}
