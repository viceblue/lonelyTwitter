package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hzhu6 on 9/15/15.
 */
public abstract class Mood {
    private String currentmood;
    private Date date;

    public Mood(String mood, Date date){
        this.currentmood=mood;
        this.date=date;
    }

    public Mood(String mood){
        this.currentmood=mood;
        this.date=new Date();
    }
    public abstract String retureMood();

    public String getCurrentmood() {
        return currentmood;
    }

    public void setCurrentmood(String currentmood) {
        this.currentmood = currentmood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
