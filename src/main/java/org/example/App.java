package org.example;

import org.example.model.LengthMeasure;
import org.example.model.MeasureValues;

import java.util.Scanner;

public class App {
    public static MeasureValues convert(LengthMeasure from, LengthMeasure to, double quantity) {
        double value = from.getToMeter() * quantity / to.getToMeter();
        return new MeasureValues(to, value);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Доступные величины");
        for (int i = 0; i < LengthMeasure.values().length; i++) {
            System.out.println(i + " " + LengthMeasure.values()[i].getName());
        }
        System.out.println("Введите номер величины, из которой хотите перевести>>");
        int from = in.nextInt();
        System.out.println("Введите номер величины, в которую хотите перевести>>");
        int to = in.nextInt();
        System.out.println("Введите значение>>");
        double val = in.nextDouble();
        MeasureValues result = convert(LengthMeasure.values()[from], LengthMeasure.values()[to], val);
        System.out.println(result.getValue() + " " + LengthMeasure.values()[to].getName());
    }
}
