package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hzhu6 on 9/15/15.
 */
public abstract class Tweet extends Object implements Tweetable{
    private String text;
    private Date date;
    private ArrayList<Mood> ArrayofMood;

    public String getText() {
        return text;
    }

    public void setText(String text) throws IOException {
        if (text.length()<=140) {
            this.text = text;
        }else{
            throw new IOException("Too long");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Tweet(String tweet){
        this.text=tweet;
        this.date=new Date();
    }

    public Tweet(String tweet, Date date){
        this.text=tweet;
        this.date=date;
    }

    public abstract Boolean isimportant();
}
