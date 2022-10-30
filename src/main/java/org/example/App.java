package org.example;

import org.example.model.LengthMeasure;
import org.example.model.MeasureValues;

public class App {
    public static MeasureValues convert(LengthMeasure from, LengthMeasure to, double quantity) {
        double value = from.getToMeter() * quantity / to.getToMeter();
        MeasureValues measureValues = new MeasureValues(to, value);
        return measureValues;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
