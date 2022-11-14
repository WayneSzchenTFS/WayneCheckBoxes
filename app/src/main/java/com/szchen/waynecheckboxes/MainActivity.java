package com.szchen.waynecheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkjava;
    private CheckBox chkpython;
    private CheckBox chkcplus;
    private Button button2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkjava=findViewById(R.id.chkjava);
        chkpython=findViewById(R.id.chkpython);
        chkcplus=findViewById(R.id.chkcplus);
        textView=findViewById(R.id.textView);
        button2=findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                StringBuilder s = new StringBuilder();
                if(chkjava.isChecked())
                    s.append(chkjava.getText().toString() + "\n");
                if(chkpython.isChecked())
                    s.append(chkpython.getText().toString() + "\n");
                if(chkcplus.isChecked())
                    s.append(chkcplus.getText().toString() + "\n");

                textView.setText(s);
            }
        });



    }
}