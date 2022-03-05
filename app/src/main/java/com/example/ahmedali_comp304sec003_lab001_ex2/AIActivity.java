package com.example.ahmedali_comp304sec003_lab001_ex2;

import static androidx.constraintlayout.widget.StateSet.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class AIActivity extends AppCompatActivity {

    //Declare variables
    TextView tvAI;
    ArrayList<String> lifeCycleAI = new ArrayList<>();
    String tag = "AIActivity Lifecycle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);


        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnCreate));

        //Initialize txAI variable
        tvAI = (TextView) findViewById(R.id.textViewAI);

        //Add event name to lifeCycleAI array
        lifeCycleAI.add(getString(R.string.aiOnCreate));
        lifeCycleAI.add("\n");

    }

    //onStart method
    public void onStart()
    {
        super.onStart();

        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnStart));

        //Add event name to lifeCycleAI array
        lifeCycleAI.add(getString(R.string.aiOnStart));
        executeLifeCycles();
    }

    //onStop method
    public void onStop()
    {
        super.onStop();

        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnStop));


        //Add event name to lifeCycleAI array
        lifeCycleAI.add("\n");
        lifeCycleAI.add(getString(R.string.aiOnStop));
        executeLifeCycles();

    }

    //onDestroy method
    public void onDestroy()
    {
        super.onDestroy();

        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnDestroy));


        //Add event name to lifeCycleAI array
        lifeCycleAI.add("\n");
        lifeCycleAI.add(getString(R.string.aiOnDestroy));
        executeLifeCycles();
    }



    //executeLifeCycles method to fetch lifeCycleAI array
    public void executeLifeCycles(){
        String result = "";
        for (String state: lifeCycleAI) {
            result += state;
            tvAI.setText(result);
        }
    }
}