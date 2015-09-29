package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
        //if wanna test other activity, call it here
        // before code sth, write a test for it and it should fail
        //once fail, write code in main app, until it passes, and back to step 1
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }
}