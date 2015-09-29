package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by hzhu6 on 9/29/15.
 */
public class Tweetlist {
    private Tweet mostRecentTweet;
    private ArrayList<Tweet> tweets =new ArrayList<Tweet>();
    private int tweetnum=0;

    public void add(Tweet tweet){
        mostRecentTweet=tweet;
        tweets.add(tweet);
        tweetnum++;
    }
    public Tweet getMostRecentTweet(){
        return mostRecentTweet;
    }
    public int count(){
        return tweets.size();
    }

    public boolean isdup(Tweet tweet) {
        boolean x = false;
        for (int i = 0; i < tweets.size(); i++) {
            if (tweets.get(i).getText() == tweet.getText()) {
                x=true;
            }
        }
        return x;
    }

    public void addTweet(Tweet tweet){
        if(isdup(tweet)==true){
            throw new IllegalArgumentException();
        }else{
            this.add(tweet);
        }
    }
    //-- should throw an IllegalArgumentException when one tries to add a duplicate tweet
    public  ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> newlist= new ArrayList<Tweet>();
        for(int i=0; i< tweets.size(); i++){
            newlist.add(tweets.get(i));
        }
        return newlist;
    }
    //-- sould return a list of tweets in chronological order
    public boolean hasTweet(Tweet tweet){
        return isdup(tweet);
    }

    //-- should return true if there is a tweet that equals() another tweet
    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
        tweetnum--;

    }
    //-- should remove a tweet
    public int getCount(){
        return tweetnum;
    }
    //-- should accurately count up the tweets



}
