package com.necistudio.test;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.core.deps.guava.util.concurrent.SettableFuture;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private Context context;
    @Before
    public void run(){
        context = InstrumentationRegistry.getContext();
    }
    @Test
    public void useAppContext() throws Exception {
        final SettableFuture<String> future = SettableFuture.create();

        TestData testData = new TestData();
        testData.isData(new TestData.CallBack() {
            @Override
            public void isidata(String data) {
                future.set(data);
            }
        });

        String result = future.get(4, TimeUnit.SECONDS);
        assertEquals(result,"aa");
    }
}
