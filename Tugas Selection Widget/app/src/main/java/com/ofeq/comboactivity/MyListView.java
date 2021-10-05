package com.ofeq.comboactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyListView extends AppCompatActivity {


    //membuat variable untuk menampung data dg tipe data integer
    private ArrayList<Integer>  listAngka = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view);

        //memanggil komponen listview
        ListView MineLv= findViewById(R.id.minelv);

        //looping untuk membuat angka 1-100
        for (int i= 0; i < 100; i++){
            //membuat agar tampilan dimulai dari 1
            listAngka.add(i+1);

        }
        //membuat variable adapter dengan parameter this untuk menampilkan list view
        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listAngka);
        //set array kedalam adapter untuk memanggil MineLv, sehingga list angka 1-100 akan tampil
        MineLv.setAdapter(adapter);
        //menampilkan pesan sesuai button yang dipilih
        Toast.makeText( getApplicationContext(), "Anda memilih List View", Toast.LENGTH_SHORT).show();



    }
}