package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hzhu6 on 9/15/15.
 */
public class Sad extends Mood{
    public Sad(String sth){
        super(sth);
    }

    public Sad(String sth, Date sd){
        super(sth,sd);
    }

    @Override
    public String retureMood(){
        return "you are sad";
    }
    @Override
    public String getCurrentmood(){
        return "Sad as: " + super.getCurrentmood();
    }
}
