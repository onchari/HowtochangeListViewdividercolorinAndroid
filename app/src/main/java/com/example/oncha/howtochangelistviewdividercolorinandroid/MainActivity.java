package com.example.oncha.howtochangelistviewdividercolorinandroid;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    String[] fruits = new String[] {
            "Chokeberry",
            "Chinese Quince",
            "Clementine",
            "Coco Plum",
            "Cola nut"
    };

    Button btn_changeColor;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_changeColor = (Button) findViewById(R.id.btn);
        btn_changeColor.setOnClickListener(this);
        listView = (ListView) findViewById(R.id.lv);


        //creat a list from string array
        final  List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        //create an arrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits_list);

        //databind the listview with items from arrayadapter
        listView.setAdapter(arrayAdapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                changeListDividerColor();
        }
    }

    private void changeListDividerColor() {
        listView.setDivider(new ColorDrawable(Color.parseColor("#FF4A4D93")));
        listView.setDividerHeight(2);
    }
}
