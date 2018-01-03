package com.iquestgroup.remotelearning.week1p1.taskBoard;

public abstract class Card {
    Color color;
    String title;
    int rowNumber;
    Column column;
    String description;
    int id;

    public Card(int id, String title, int rowNumber,Column column, String description) {
        this.id = id;
        this.color = color;
        this.column=column;
        this.rowNumber = rowNumber;
        this.title = title;
        this.description = description;
    }


}
