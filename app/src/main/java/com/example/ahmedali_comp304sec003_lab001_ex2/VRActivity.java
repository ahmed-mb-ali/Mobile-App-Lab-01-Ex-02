package com.example.ahmedali_comp304sec003_lab001_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class VRActivity extends AppCompatActivity {


    //Declare variables
    TextView tvVR;
    ArrayList<String> lifeCycleVR = new ArrayList<>();
    String tag = "VRActivity Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);


        //Display the event in the log
        Log.d(tag, getString(R.string.vrOnCreate));

        //Initialize txVR variable
        tvVR = (TextView) findViewById(R.id.textViewVR);

        //Add event name to lifeCycleVR array
        lifeCycleVR.add(getString(R.string.vrOnCreate));
        lifeCycleVR.add("\n");

    }

    //onStop method
    public void onStop()
    {
        super.onStop();

        //Display the event in the log
        Log.d(tag, getString(R.string.vrOnStop));


        //Add event name to lifeCycleVR array
        lifeCycleVR.add("\n");
        lifeCycleVR.add(getString(R.string.vrOnStop));
        executeLifeCycles();
    }

    //onDestroy method
    public void onDestroy()
    {
        super.onDestroy();

        //Display the event in the log
        Log.d(tag, getString(R.string.vrOnDestroy));


        //Add event name to lifeCycleVR array
        lifeCycleVR.add("\n");
        lifeCycleVR.add(getString(R.string.vrOnDestroy));
        executeLifeCycles();
    }

    //onStart method
    public void onStart()
    {
        super.onStart();

        //Display the event in the log
        Log.d(tag, getString(R.string.vrOnStart));

        //Add event name to lifeCycleAI array
        lifeCycleVR.add(getString(R.string.aiOnStart));
        executeLifeCycles();
    }

    //executeLifeCycles method to fetch lifeCycleVR array
    public void executeLifeCycles() {
        String result = "";
        for (String state : lifeCycleVR) {
            result += state;
            tvVR.setText(result);
        }
    }
}