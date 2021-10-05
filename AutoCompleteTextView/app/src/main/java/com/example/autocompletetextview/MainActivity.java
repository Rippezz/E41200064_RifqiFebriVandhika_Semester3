package com.example.autocompletetextview;
//support source code
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    //item array menggunakan string
    private static final String[] FOOD = new String[] {
            "Makan_RujakSoto","Makan_PecelRawon","Makan_AyamMerah", "Makan_AyamCrispy", "Makan_AyamKecap",
            "Makan_UdangCrispy", "Minum_EsTeh" ,"Minum_Joshua","Minum_KopiHitam","Minum_KopiSusu","Minum_EsSusu",
    };
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        //untuk memanggil array untuk dimasukkan dalam auto complete view
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, FOOD);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.food_list);
        textView.setAdapter(adapter);
    }
}