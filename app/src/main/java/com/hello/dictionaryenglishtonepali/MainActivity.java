package com.hello.dictionaryenglishtonepali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MainActivity extends AppCompatActivity {

    EditText etWord, etMean;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWord = findViewById(R.id.etWord);
        etMean = findViewById(R.id.etMean);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    saveMean();
            }
        });

    }
    private  void saveMean(){
        try {
            PrintStream printStream = new PrintStream(openFileOutput("words.txt",MODE_PRIVATE | MODE_APPEND));
            printStream.println(etWord.getText().toString()+"->"+etMean.getText().toString());
            Toast.makeText(this,"saved to "+ getFilesDir(),Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            Log.d("err", "Error" +e.toString());
            e.printStackTrace();
        }

    }
}
