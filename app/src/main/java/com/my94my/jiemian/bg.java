package com.my94my.jiemian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bg extends AppCompatActivity
{
    Button fh;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bg);
        fh=(Button)findViewById(R.id.fh);

        fh.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(bg.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
