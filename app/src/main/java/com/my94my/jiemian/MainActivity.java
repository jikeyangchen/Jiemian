package com.my94my.jiemian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button xx,xd,z,bg,wg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xx=(Button)findViewById(R.id.xx);
        xd=(Button)findViewById(R.id.xd);
        z=(Button)findViewById(R.id.z);
        bg=(Button)findViewById(R.id.bg);
        wg=(Button)findViewById(R.id.wg);

        xx.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(MainActivity.this,xx.class);
                startActivity(intent);
            }
        });
        xd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(MainActivity.this,xd.class);
                startActivity(intent);
            }
        });
        z.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(MainActivity.this,z.class);
                startActivity(intent);
            }
        });
        bg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(MainActivity.this,bg.class);
                startActivity(intent);
            }
        });
        wg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(MainActivity.this,wg.class);
                startActivity(intent);
            }
        });
    }
}
