package com.example.handbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Text_Content_ActivityTest extends AppCompatActivity {
    private Typeface face1;
    private TextView text_content;
    private int category = 0;
    private int position = 0;
    private int [] array_pc = {R.string.pc_1, R.string.pc_2, R.string.pc_3, R.string.pc_4, R.string.pc_5, R.string.pc_6, R.string.pc_7, R.string.pc_8};
    private int [] array_fc = {R.string.fc_1, R.string.fc_2};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
       init();
    }
    private void receiveIntent() {
        Intent i = getIntent();
        if (i != null) {
category = i.getIntExtra("category",0);
position = i.getIntExtra("position",0);
        }
        switch (category) {
            case 0:
text_content.setText(array_pc [position]);
                break;
            case 1:
                text_content.setText(array_fc [position]);
                break;
            case 2:

                break;
        }
    }
    private void init ()
    {
        text_content = findViewById(R.id.textView2);
        receiveIntent();
        face1 = Typeface.createFromAsset(this.getAssets(), "fonts/Roboto-MediumItalic.ttf");
        text_content.setTypeface(face1);
    }
}