package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] numberList = {"2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988", "2233669988",};
    String[] nameList = {"Ghatiyo Surat", "Arpan RNW", "jagdish RNW", "Sanket RNW", "Amit Vavdi", "D.S. Jaliya", "Arjun Mer", "Riddhi Medam", "Jaydip Jadeja", "P.J.Patel", "Ghatiyo Surat", "Arpan RNW", "jagdish RNW", "Sanket RNW", "Amit Vavdi", "D.S. Jaliya", "Arjun Mer", "Riddhi Medam", "Jaydip Jadeja", "P.J.Patel", "Ghatiyo Surat", "Arpan RNW", "jagdish RNW", "Sanket RNW", "Amit Vavdi", "D.S. Jaliya", "Arjun Mer", "Riddhi Medam", "Jaydip Jadeja", "P.J.Patel"};
    int[] imageList = {R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___, R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,R.drawable.avatar___,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview();


    }

    private void listview() {

        listView = findViewById(R.id.listView);
        CustomListView adapter = new CustomListView(imageList,nameList, numberList, MainActivity.this);
        listView.setAdapter(adapter);


    }
}