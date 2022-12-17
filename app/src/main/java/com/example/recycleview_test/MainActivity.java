package com.example.recycleview_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ArrayList<Text>data=new ArrayList<>();


            Text myText = new Text();
            myText.setName("Ava");
            myText.setMessage("Avava AvA给你一拳！！！");
            myText.setTime("2022.6.12");
            Text ava=new Text("Ava",R.drawable.ava);
            data.add(myText);

        Adapter Adapter = new Adapter(data);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}