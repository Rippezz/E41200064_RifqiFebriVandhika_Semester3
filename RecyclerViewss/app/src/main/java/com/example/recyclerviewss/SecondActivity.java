package com.example.recyclerviewss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    //menggunakan ImageView dan TextView agar konek dengan imageview dan textview dan panggil variablenya
    //yang sudah dibuat activity_second.xml
    ImageView mainImageView;
    TextView title, description;
    //menggunakan tipedata string untuk text dan int untuk gambar
    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        //setelah private void getData dan setData berhasil dibuat aktifkan getData dan setData
        getData();
        setData();
    }
    //private void getData untuk mendapatkan data data dari variable diatas
    private void getData() {
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);
        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_LONG).show();
        }
    }
    //private void setData untuk menyesuaikan atau mencocokkan data dari title, description dan image
    private void setData() {
        title.setText(data1);
        description.setText(data2);
        mainImageView.setImageResource(myImage);
    }

}