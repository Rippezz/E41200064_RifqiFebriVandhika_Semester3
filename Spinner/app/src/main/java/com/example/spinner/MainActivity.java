package com.example.spinner;
//import untuk support source code yang digunakan
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk spinner makanan
        Spinner spinnermakan = (Spinner) findViewById(R.id.spinnermakan);
        spinnermakan.setOnItemSelectedListener(new MyOnItemSelectedListener());
        //array isi dari spinner yang dipanggil dari strings.xml
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.makanan_array,
                android.R.layout.simple_spinner_dropdown_item);
        adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnermakan.setAdapter(adapter);

        //untuk spinner minuman
        Spinner spinnerminum = (Spinner) findViewById(R.id.spinnerminum);
        spinnerminum.setOnItemSelectedListener(new MyOnItemSelectedListener());
        //array isi dari spinner yang dipanggil dari strings.xml
        adapter = ArrayAdapter.createFromResource(
                this, R.array.minuman_array,
                android.R.layout.simple_spinner_dropdown_item);
        adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerminum.setAdapter(adapter);
    }
    //memberikan action ketika memilih item pada spinner
    public class MyOnItemSelectedListener implements OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                   long id) {
            Toast
                    .makeText(parent.getContext(),
                            parent.getItemAtPosition(pos).toString(),
                            Toast.LENGTH_LONG).show();
        }
        //ketika tidak ada yang dipilih
        public void onNothingSelected(AdapterView<?> arg0) {
        }

    }
}