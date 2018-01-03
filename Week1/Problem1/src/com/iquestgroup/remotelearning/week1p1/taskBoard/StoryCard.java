package com.iquestgroup.remotelearning.week1p1.taskBoard;

public class StoryCard extends Card {

    String story;
    int storyPoints;


    public StoryCard( int id,String title, int rowNumber,Column column, String story, int storyPoints, String description) {
        super(id, title, rowNumber,column, description);
        this.story = story;
        this.storyPoints = storyPoints;
        this.color=Color.YELLOW;

    }


}
