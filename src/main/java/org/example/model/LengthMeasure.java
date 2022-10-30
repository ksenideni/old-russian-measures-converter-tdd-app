package org.example.model;

public enum LengthMeasure implements Measurable{
    METER("Метр"),
    VERST("Верста"),
    SAZHEN("Сажень"),
    ARSHIN("Аршин");

    private String name;

    LengthMeasure(String name) {
        this.name = name;
    }
}
