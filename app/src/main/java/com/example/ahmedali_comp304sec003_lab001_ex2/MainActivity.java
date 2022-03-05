package com.example.ahmedali_comp304sec003_lab001_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Declare variables
    TextView tvMainActivity;
    ArrayList<String> lifeCycleActivities = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize tvMainActivity variable
        tvMainActivity = (TextView) findViewById(R.id.textView);

        //Add event name to lifeCycleActivities array
        lifeCycleActivities.add(getString(R.string.mainActivity));
        lifeCycleActivities.add("\n");

        lifeCycleActivities.add(getString(R.string.mainActivityOnCreate));
        lifeCycleActivities.add("\n");

    }

    //onStart method
    public void onStart() {
        super.onStart();

        //Add event name to lifeCycleActivities array
        lifeCycleActivities.add(getString(R.string.mainActivityOnStart));

        //loop to fetch lifeCycleActivities array
        String result = "";
        for (String state : lifeCycleActivities) {
            result += state;
            tvMainActivity.setText(result);
        }

        //clear lifeCycleActivities array
        lifeCycleActivities.clear();
    }
}