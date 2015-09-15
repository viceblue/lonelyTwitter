package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hzhu6 on 9/15/15.
 */
public class Happy extends Mood{

    public Happy(String sth){
        super(sth);
    }

    public Happy(String sth, Date sd){
        super(sth,sd);
    }


    @Override
    public String retureMood(){
        return "you are happy";
    }

    @Override
    public String getCurrentmood(){
        return "Happy as: " + super.getCurrentmood();
    }
}
