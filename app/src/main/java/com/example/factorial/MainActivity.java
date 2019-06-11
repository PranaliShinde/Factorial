package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textView;
EditText editText;
String s;

long a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    s = editText.getText().toString().trim();
                    a = Integer.parseInt(s);
                    long ans = 1;
                    if(a>15)
                    {
                        Toast.makeText(MainActivity.this,"Invalid number input..Enter again",Toast.LENGTH_SHORT).show();

                    }
                    else {
                        for (int i = 1; i <= a; i++) {
                            ans = ans * i;
                        }
                        Toast.makeText(MainActivity.this, "The factorial is " + ans, Toast.LENGTH_SHORT).show();
                    }
                    }
                catch(NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"Invalid number input..Enter again",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
