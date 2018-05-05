package com.my94my.jiemian;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class z extends AppCompatActivity
{
	int c = 0;
	ImageView iv;
	Button fh ;
	final int[] names = new int[]{
			R.drawable.class_12_4,
			R.drawable.class_8_4,
			R.drawable.class_10_4,
			R.drawable.class_11_4,
			R.drawable.class_23_4,
	};

	final ImageView[] views = new ImageView[names.length];

	final Handler handler = new Handler()
	{
		@Override
		public void handleMessage(Message msg)
		{
			if (msg.what == 0x123)
			{
				iv.setImageResource(names[c % 5]);
				c++;
			}
			super.handleMessage(msg);
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		for (int i = 0; i < names.length; i++)
		{
			views[i] = (ImageView) findViewById(names[i]);
		}

		new Timer().schedule(new TimerTask()
		{
			@Override
			public void run()
			{
				handler.sendEmptyMessage(0x123);
			}
		}, 0, 1000);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.z);
		iv = (ImageView) findViewById(R.id.iv);
		fh= (Button) findViewById(R.id.fh);
		fh.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Intent intent = new Intent(z.this, MainActivity.class);
				startActivity(intent);
			}
		});

	}
}
