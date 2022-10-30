package org.example.model;

public enum LengthMeasure implements Measurable {
    METER("Метр", 1),
    VERST("Верста", 1066.8),
    SAZHEN("Сажень", 2.133),
    ARSHIN("Аршин", 0.711);

    public String getName() {
        return name;
    }

    public double getToMeter() {
        return toMeter;
    }

    private String name;
    private double toMeter;

    LengthMeasure(String name, double toMeter) {
        this.name = name;
        this.toMeter = toMeter;
    }
}
