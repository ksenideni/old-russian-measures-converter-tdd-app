package org.example;

import org.example.model.LengthMeasure;
import org.example.model.MeasureValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void convert_VerstToMeter() {
        MeasureValues result = App.convert(LengthMeasure.VERST, LengthMeasure.METER, 5);
        assertEquals(5334, result.getValue());
        assertEquals(LengthMeasure.METER, result.getName());
    }
}
