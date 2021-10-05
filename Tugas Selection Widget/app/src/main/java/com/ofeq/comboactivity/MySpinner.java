package com.ofeq.comboactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MySpinner extends AppCompatActivity {
//deklarasi spinner
    private Spinner mysp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_spinner);
    //inisialisasi spinner
        mysp = (Spinner) findViewById(R.id.spinnerku);

        /*
        * membuat variable orang dengan tipe string
        * untuk mengisi data pada spinner
        * saya menggunakan arraylist*/
        List<String> orang = new ArrayList<>();
        orang.add("Mahasiswa");
        orang.add("Dosen");
        orang.add("Rektor");
        orang.add("Teknisi");
        orang.add("Wakil Direktur");
        orang.add("Keamanan");
        orang.add("Kepala Prodi");
        orang.add("Kepala Jurusan");

        //membuat apdapter untuk daftar orang
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MySpinner.this, android.R.layout.simple_list_item_1, orang);

        //menentukan model adapter (membuat variable adapter) untuk menampilkan spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //memanggil spinner dengan adapter yang sudah dibuat agar muncul tampilan
        mysp.setAdapter(adapter);
        //menampilkan pesan sesuai button yang dipilih/diklik
        Toast.makeText(getApplicationContext(), "Anda memilih Spinner", Toast.LENGTH_SHORT).show();
    }
}