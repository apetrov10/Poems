package com.stihotvorenia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;



public class MainActivity extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		Button button1 = (Button)findViewById(R.id.button1);
	}
	
	
	@Override
	public void onClick(View v) {
		switch(v.getId()) {
        case R.id.button1:
        	Intent nextScreen1 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen1.putExtra("id", 1);
        	 startActivity(nextScreen1);

        break;
        case R.id.button2:
        	Intent nextScreen2 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen2.putExtra("id", 2);
        	startActivity(nextScreen2);
        break;
        case R.id.button3:
        	Intent nextScreen3 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen3.putExtra("id", 3);
        	startActivity(nextScreen3);
        break;
        case R.id.button4:
        	Intent nextScreen4 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen4.putExtra("id", 4);
        	startActivity(nextScreen4);
        break;
        case R.id.button5:
        	Intent nextScreen5 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen5.putExtra("id", 5);
        	startActivity(nextScreen5);
        break;
        case R.id.button6:
        	Intent nextScreen6 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen6.putExtra("id", 6);
        	startActivity(nextScreen6);
        break;
        case R.id.button7:
        	Intent nextScreen7 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen7.putExtra("id", 7);
        	startActivity(nextScreen7);
        break;
        case R.id.button8:
        	Intent nextScreen8 = new Intent(getApplicationContext(), proizvedeniya.class);
        	nextScreen8.putExtra("id", 8);
        	startActivity(nextScreen8);
        break;
      
		}
	}

		
	}
