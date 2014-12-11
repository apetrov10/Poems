package com.stihotvorenia;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.util.DisplayMetrics;

public class screen extends Activity implements OnClickListener {
	int clr = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_screen);
		TextView b1 = (TextView)findViewById(R.id.txt);
		LinearLayout li=(LinearLayout)findViewById(R.id.back);
		ScrollView li1=(ScrollView)findViewById(R.id.backgr);
		li.setBackgroundColor(Color.WHITE);
		li1.setBackgroundColor(Color.WHITE);
		b1.setTextSize(16);
		b1.setBackgroundColor(Color.WHITE);
		Bundle extra = getIntent().getExtras(); 
	    String addOn = extra.getString("id");
	    String packageName = getPackageName();
	    int resId = getResources().getIdentifier(addOn, "string", packageName);
	    b1.setText(getString(resId));
	}
	
	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		
	 case R.id.txt:
		 TextView t5 = (TextView)findViewById(R.id.txt);
		 LinearLayout li=(LinearLayout)findViewById(R.id.back);
		 ScrollView li1=(ScrollView)findViewById(R.id.backgr);
		 Button b1=(Button) findViewById(R.id.button_1);
		 Button b2=(Button) findViewById(R.id.button_2);
		 Button b3=(Button) findViewById(R.id.button_3);
		 if (clr % 2 == 0){			 
			 li.setBackgroundColor(Color.BLACK);
			 li1.setBackgroundColor(Color.BLACK);
			 t5.setBackgroundColor(Color.BLACK);
			 t5.setTextColor(Color.WHITE);
			 b1.setTextColor(Color.WHITE);
			 b2.setTextColor(Color.WHITE);
			 b3.setTextColor(Color.WHITE);
			 clr++;
		 }
		 else{
			li.setBackgroundColor(Color.WHITE);
			li1.setBackgroundColor(Color.WHITE);
		 	t5.setBackgroundColor(Color.WHITE);
		 	t5.setTextColor(Color.BLACK);
		 	b1.setTextColor(Color.BLACK);
			b2.setTextColor(Color.BLACK);
			b3.setTextColor(Color.BLACK);
		 	clr--;
		 	}
		break;
	 case R.id.button_1:
     	finish();
     	break;	
	 case R.id.button_3:
		 DisplayMetrics metrics;
		 TextView t1 = (TextView)findViewById(R.id.txt);
		 metrics = getApplicationContext().getResources().getDisplayMetrics();
		 float Textsize =t1.getTextSize()/metrics.density;
		 t1.setTextSize(Textsize-4);
		 break;
	 case R.id.button_2:
		 TextView t2 = (TextView)findViewById(R.id.txt);
		 metrics = getApplicationContext().getResources().getDisplayMetrics();
		 float Textsize2 =t2.getTextSize()/metrics.density;
		 t2.setTextSize(Textsize2+4);
	     break;	
	 
		}
	}
}
