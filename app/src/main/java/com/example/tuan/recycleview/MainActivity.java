package com.example.tuan.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.my_recycler_view);


        recyclerView.setHasFixedSize(true);

        List<item> mList = new ArrayList<>();
        mList.add(new item(R.drawable.a, "IronMan"));
        mList.add(new item(R.drawable.b, "IronMan"));
        mList.add(new item(R.drawable.c, "IronMan"));
        mList.add(new item(R.drawable.d, "IronMan"));
        mList.add(new item(R.drawable.e, "IronMan"));
        mList.add(new item(R.drawable.e, "IronMan"));

        Adapter adapter = new Adapter(this, mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
