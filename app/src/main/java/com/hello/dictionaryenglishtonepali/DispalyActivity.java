package com.hello.dictionaryenglishtonepali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DispalyActivity extends AppCompatActivity {
     private ListView lvList;
     private Map<String, String> dictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly);

        lvList = findViewById(R.id.lvList);
        dictionary = new HashMap<>();
        ArrayAdapter adapter = new ArrayAdapter<>(
            this,
            andriod.R.Layout.simple_list_item_1,
            new ArrayList<String>(dictionary.keySet())
                    );

        }
        lvList.setAdapter(adapter);
    }
}
