package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hzhu6 on 9/15/15.
 */
public class ImportantTweet extends Tweet{
    public ImportantTweet(String text){
        super(text);
    }

    public ImportantTweet(String text, Date date){
        super(text, date);
    }

    public Boolean isimportant(){
        return Boolean.TRUE;
    }

    @Override
    public String getText(){
        return "important: " + super.getText();
    }

}
