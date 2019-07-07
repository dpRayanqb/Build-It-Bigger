package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;


public class JokeTest extends AndroidTestCase {

    @SuppressWarnings("unchecked")
    public void test() {
        String result = null;
        try {
            result = new EndpointsAsyncTask().execute().get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
