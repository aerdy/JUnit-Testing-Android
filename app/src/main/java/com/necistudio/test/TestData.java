package com.necistudio.test;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Vim on 7/31/2017.
 */

public class TestData {

    public void isData(final CallBack callBack) {
        new AsyncTask<String, String, String>() {
            @Override
            protected String doInBackground(String... params) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(400);
                        } catch (Exception e) {

                        }
                    }
                }).run();
                callBack.isidata("selesai");
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                callBack.isidata("post");
            }
        }.execute();
    }

    public String isData2() {
        return "yes";
    }

    public interface CallBack {
        void isidata(String data);
    }
}
