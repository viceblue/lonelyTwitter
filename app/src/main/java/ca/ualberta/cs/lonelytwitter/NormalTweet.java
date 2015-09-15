package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hzhu6 on 9/15/15.
 */
public class NormalTweet extends Tweet{
    public NormalTweet(String tweet, Date date) {
        super(tweet, date);
    }

    public NormalTweet(String tweet) {
        super(tweet);
    }
    public Boolean isimportant(){
        return Boolean.FALSE;
    }
}
