package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hzhu6 on 10/7/15.
 */
public interface MyObservable {

    void addObserver(MyObserver observer);
    void notifyObservers();

}
