package org.example.model;

public class MeasureValues {
    private Measurable name;
    private double value;

    public MeasureValues(Measurable name, double value) {
        this.name = name;
        this.value = value;
    }

    public Measurable getName() {
        return name;
    }

    public void setName(Measurable name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
