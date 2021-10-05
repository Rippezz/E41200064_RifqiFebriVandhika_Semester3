package com.example.recyclerviewss;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    //beri tipedata dan variable untuk memasukkan array
    String s1[], s2[];
    int images[] = {R.drawable.sopayam,R.drawable.rawon,R.drawable.nasigoreng,R.drawable.nasicampur,R.drawable.gulaikambing,
                    R.drawable.cireng};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil recyclerview dari activity_main.xml
        recyclerView = findViewById(R.id.recyclerView);
        //munampilkan variable diatas sudah dibuat dan panggil array dari strings.xml
        s1 = getResources().getStringArray(R.array.menumakan);
        s2 = getResources().getStringArray(R.array.description);
        //mengkonekkan variable s1 s2 dan image menggunakan adapter
        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}