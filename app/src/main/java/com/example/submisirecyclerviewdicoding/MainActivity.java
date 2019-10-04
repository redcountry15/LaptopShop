package com.example.submisirecyclerviewdicoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerLaptop;
ArrayList<Laptop>  list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerLaptop = findViewById(R.id.RecyclerLaptop);

        if (recyclerLaptop!=null){
            recyclerLaptop.setHasFixedSize(true);
        }

        list.addAll(DataLaptop.getListData());

        showRecyclerView();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.AboutMe:
                Intent intentku = new Intent(MainActivity.this,Biodata.class);
                startActivity(intentku);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private  void showRecyclerView(){
        recyclerLaptop.setLayoutManager(new LinearLayoutManager(this));
        LaptopAdapter laptop = new LaptopAdapter(list);
        recyclerLaptop.setAdapter(laptop);


    }
}
