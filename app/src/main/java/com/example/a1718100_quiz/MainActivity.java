package com.example.a1718100_quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FamilyAdapter adapter;
    private ArrayList<family>familyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recycleview);
        adapter = new FamilyAdapter(familyArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        familyArrayList = new ArrayList<>();
        //mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.ten),));

        familyArrayList.add(new family(getDrawable(R.drawable.bapak),"Samiin", "Ayah", "Petani"));
        familyArrayList.add(new family(getDrawable(R.drawable.abang),"Khotibul Umam", "Kakak", "Pedagan"));
        familyArrayList.add(new family(getDrawable(R.drawable.adik),"Khofitul Riski", "Adek", "Karyawan Pukesmas"));
        familyArrayList.add(new family(getDrawable(R.drawable.aku),"Irkham", "Kakak", "Pelajar"));
    }
}
