package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

import java.util.IllegalFormatCodePointException;

/**
 * Created by hzhu6 on 9/29/15.
 */
public class TweetlistTest extends ActivityInstrumentationTestCase2 {
    public TweetlistTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }



    public void testHoldsStuff(){
        Tweet tweet= new NormalTweet("test");
        Tweetlist list = new Tweetlist();
        list.add(tweet);
        assertSame(list.getMostRecentTweet(), tweet);
    }

    public void testHoldsManyThings(){
        Tweet tweet= new NormalTweet("test");
        Tweetlist list = new Tweetlist();
        list.add(tweet);
        assertEquals(list.count(), 1);
        list.add(new NormalTweet("test"));
        assertEquals(list.count(), 2);
    }

    public void testReportDup(){
        try {
            Tweet tweeti = new NormalTweet("test1");
            Tweetlist list = new Tweetlist();
            Tweet tweetii = new NormalTweet("test2");
            assertEquals(list.hasTweet(tweetii), false);
            list.add(tweeti);
            list.add(tweetii);
            Tweet tweetiii = new NormalTweet("test1");
            assertEquals(list.hasTweet(tweetiii), true); //
            list.addTweet(tweetiii);
        }catch (IllegalArgumentException e) {
            //do noth
        }
    }

    public void anothertest(){
        Tweet tweeti = new NormalTweet("test1");
        Tweetlist list = new Tweetlist();
        Tweet tweetii = new NormalTweet("test2");

        assertEquals(list.hasTweet(tweetii), false);
        list.add(tweeti);
        list.add(tweetii);
        assertEquals(list.getCount(), 2);

        Tweet tweetiii = new NormalTweet("test1");
        assertEquals(list.hasTweet(tweetiii), true); //
        list.removeTweet(tweetiii);
        assertEquals(list.hasTweet(tweetiii), false);
        assertEquals(list.getCount(), 1);
    }

}