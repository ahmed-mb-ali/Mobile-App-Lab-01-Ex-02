package com.example.ahmedali_comp304sec003_lab001_ex2;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class FirstFragment<position> extends ListFragment {


    ArrayAdapter arrayAdapter;
    Intent intent;


    private String[] listActivity = { "AIActivity", "VRActivity"};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }//end method

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        //ArrayAdapter to view the listActivity list
        //Used getActivity method to get the context
        arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, listActivity);
        setListAdapter(arrayAdapter);

        //Toast class method to display a quick message
        Toast.makeText(getActivity(), R.string.fragment1_onCreate, Toast.LENGTH_SHORT).show();

        return view;

    }//end method

    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {

        //When you select an item from the list the color is set to dark blue
        getListView().setSelector(android.R.color.holo_blue_dark);

        //A switch that takes current position for string array argument
        //Checks if its value matches any of the switch cases
        //Then perform corresponding logic
        switch (listActivity[position]) {
            case "AIActivity":

                //Initialize intent variable where it opens new activity
                intent = new Intent(getActivity(), AIActivity.class);
                //starts the new activity
                startActivity(intent);
                break;
            case "VRActivity":
                //Initialize intent variable where it opens new activity
                intent = new Intent(getActivity(), VRActivity.class);
                //starts the new activity
                startActivity(intent);
                break;
            default:
                break;
        }//end switch

    }//end method

    //onStart Method
    public void onStart()
    {
        //whenever the activity becomes visible, Toast displayed
        super.onStart();
        //Toast class method to display a quick message
        Toast.makeText(getActivity(), R.string.fragment1_onStart, Toast.LENGTH_SHORT).show();

    }//end method


}//end class