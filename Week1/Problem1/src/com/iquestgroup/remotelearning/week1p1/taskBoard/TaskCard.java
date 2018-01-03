package com.iquestgroup.remotelearning.week1p1.taskBoard;


import java.util.ArrayList;
import java.util.List;

public class TaskCard extends Card {

    List<Tag> tagList = new ArrayList<Tag>();

    public TaskCard(Color color, String title, int rowNumber, Column column, String description, int id) {
        super(id, title, rowNumber, column, description);
    }

    public void moveCard(int targetColumn) {
        this.columnNumber = targetColumn;
        //more elaborate code might be needed, this is merely a stump
    }

    public class Tag {

        int cardId;
        String tagText;
        String tagComment;

        public Tag(String tagText, String tagComment) {

            this.tagText = tagText;
            this.tagComment = tagComment;


        }
    }

}
