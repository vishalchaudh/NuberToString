package com.example.nubertostring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextIp;
    Button buttonRes;
    TextView textViewShow;
    String string1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextIp = findViewById(R.id.ed_num);
        buttonRes = findViewById(R.id.result_btn);

        buttonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string1 = editTextIp.getText().toString().trim();
                int chpice = Integer.parseInt(string1);
                switch (chpice){
                    case 1:
                        Toast.makeText(MainActivity.this, "ONE", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "TOW", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "THREE", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "FOUR", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "FIVE", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "SIX", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "SEVEN", Toast.LENGTH_SHORT).show();
                        break;

                    case 8:
                        Toast.makeText(MainActivity.this, "EIGHT", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(MainActivity.this, "NINE", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(MainActivity.this, "TEN", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "You entered invalid number", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
