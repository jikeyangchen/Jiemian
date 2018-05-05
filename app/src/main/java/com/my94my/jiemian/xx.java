package com.my94my.jiemian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.LinearLayout;

public class xx extends AppCompatActivity
{
    Button fh,sp,kz,cz;
    LinearLayout lo;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xx);
        lo=(LinearLayout)findViewById(R.id.ll);
        fh=(Button)findViewById(R.id.fh);
        sp=(Button)findViewById(R.id.sp);
        cz=(Button)findViewById(R.id.cz);
        kz=(Button)findViewById(R.id.kz);

        fh.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(xx.this,MainActivity.class);
                startActivity(intent);
            }
        });
        sp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lo.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        cz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lo.setOrientation(LinearLayout.VERTICAL);
            }
        });
        kz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lo.setGravity(Gravity.LEFT);
            }
        });
    }
}
