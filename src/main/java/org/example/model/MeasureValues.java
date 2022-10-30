package org.example.model;

public abstract class MeasureValues {
    private Measurable name;
    private long value;

    public Measurable getName() {
        return name;
    }

    public void setName(Measurable name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
