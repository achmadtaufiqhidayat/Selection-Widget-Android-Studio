package com.ofeq.comboactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MyAutocompleteText extends AppCompatActivity {


    //deklarasi inisialisasi variable desa
    private String[] desa = new String[]{
            "Bangorejo", "Silirsari", "Sambirejo", "Tanjungrejo",
            "Barurejo", "Yudomulyo", "Sambirejo", "Sukorejo", "Gunungsari",
            "Temurejo", "Sumberjambe", "Kebondalem", "Kedungagung"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_autocomplete_text);

        //set (inisialisasi) editText dengan id dari auticomplete text view
        AutoCompleteTextView editText = findViewById(R.id.myactv);
        //membuat variable adapter untuk menampilkan autocompletetext
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, desa);
        //memamnggil adapter agar muncul tampilan autocomplete textview saat dijalankan
        editText.setAdapter(adapter);
        //memunculkan pesan dari button yang dipilih
        Toast.makeText(getApplicationContext(), "Anda memilih Autocomplete Text View", Toast.LENGTH_SHORT).show();
    }
}