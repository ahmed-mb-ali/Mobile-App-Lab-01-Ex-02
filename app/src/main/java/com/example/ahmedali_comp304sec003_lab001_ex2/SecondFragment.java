package com.example.ahmedali_comp304sec003_lab001_ex2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class SecondFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        //Toast class method to display a quick message
        Toast.makeText(getActivity(), R.string.fragment2_onCreate, Toast.LENGTH_SHORT).show();

        return view;
    }//end method

    //onStart Method
    public void onStart()
    {
        //whenever the activity becomes visible, Toast displayed
        super.onStart();
        //Toast class method to display a quick message
        Toast.makeText(getActivity(), R.string.fragment2_onStart, Toast.LENGTH_SHORT).show();

    }//end method
}