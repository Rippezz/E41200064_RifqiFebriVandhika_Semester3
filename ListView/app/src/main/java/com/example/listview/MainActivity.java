package com.example.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    //Yang Muncul Pada List View
    String items[] = { "Rujak Soto", "Pecel Rawon",
            "Mie Ayam", "Ayam Crispy",
            "Ayam Merah", "Ayam Kecap",
            "Ayam Bakar", "Cumi Bakar",
            "Udang Crispy", "Lalapan Lele",
            "Lalapan Telur", "Lele Pedas",
            "Lalapan Terong", "Cumi Pedas",
            "Teh Hangat", "Es Teh",
            "Joshua", "Kopi Hitam"
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Memasukkan List View
        //Adaptor ditugaskan ke ListView melalui metode setAdapter pada objek ListView.
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items));
    }
    //Method Ketika DiClick Muncul Keterangan Seperti Alert
    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, ((TextView) v).getText(), Toast.LENGTH_SHORT)
                .show();
    }
}