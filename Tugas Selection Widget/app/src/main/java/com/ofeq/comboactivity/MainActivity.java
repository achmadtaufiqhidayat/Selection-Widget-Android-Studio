package com.ofeq.comboactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //deklarasi button
    private Button buttonLv, buttonSp, buttonAuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //inisialisasi button sesuai dengan id di activity_main.xml
buttonLv = (Button) findViewById(R.id.buttonLv);
buttonSp = (Button) findViewById(R.id.buttonSp);
buttonAuc = (Button) findViewById(R.id.buttonAuc);


//set button agar berpindah ke kelas MyLsitView jika button ditekan
buttonLv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        /*membuat varible Intent dengan nama Lv untuk berpindah ke activity MyListView
        spesifiknya adalah dengan menekan button (sesuainan button), maka akan berpindah ke activity yang dituju
        ini adalah jenis Intent explicit, karena hanya berpindah halaman /memanggil activity lain yang masih dalam satu project
        */
        Intent Lv = new Intent(MainActivity.this,MyListView.class);
        //menjalankan Intent dengan variable Lv yang sudah dibuat
        startActivity(Lv);
    }
});


//set button agar berpindah ke kelas MySpinner jika button ditekan
buttonSp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        /*membuat varible Intent dengan nama Sp untuk berpindah ke activity MyLiSpinner
        spesifiknya adalah dengan menekan button (sesuainan button), maka akan berpindah ke activity yang dituju
        ini adalah jenis Intent explicit, karena hanya berpindah halaman /memanggil activity lain yang masih dalam satu project
        */
        Intent Sp = new Intent(MainActivity.this,MySpinner.class);
        //menjalankan Intent dengan variable Sp yang sudah dibuat
        startActivity(Sp);
    }
});


//set button agar berpindah ke kelas MyAutocompleteText jika button ditekan
buttonAuc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        /*membuat varible Intent dengan nama Auc untuk berpindah ke activity MyLiAutocompleteText
        spesifiknya adalah dengan menekan button (sesuainan button), maka akan berpindah ke activity yang dituju
        ini adalah jenis Intent explicit, karena hanya berpindah halaman /memanggil activity lain yang masih dalam satu project
        */
        Intent Auc = new Intent(MainActivity.this,MyAutocompleteText.class);
        //menjalankan Intent Intent dengan variable Auc yang sudah dibuat
        startActivity(Auc);
    }
});


    }
}