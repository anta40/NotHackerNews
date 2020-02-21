package com.divbyzero.app.nothackernews.model;

public class Story {

    private int commentCount, score;
    private String title;

    public Story(String title, int commentCount, int score){
        this.title = title;
        this.commentCount = commentCount;
        this.score = score;
    }

    public String getTitle(){
        return title;
    }

    public int getScore(){
        return score;
    }

    public int getCommentCount(){
        return commentCount;
    }
}

