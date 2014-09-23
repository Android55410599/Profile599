package com.example.profile_599;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener {

	private TextView t1 ,t2 ,t3,t4,t5,t6;
	private Button b1,b2;
	private string d1,d2,d3,d4,d5,d6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		
	saen();
	}
	private void saen() {
		// TODO Auto-generated method stub
		t1 = (TextView) findViewById(R.id.textVie1);
		t2 = (TextView) findViewById(R.id.txtViewAge);
		t3 = (TextView) findViewById(R.id.txtViewBirthday);
		t4 = (TextView) findViewById(R.id.TextViewH);
		t5 = (TextView) findViewById(R.id.TxtViewW);
		t6 = (TextView) findViewById(R.id.TextViewEmail);
		
		b1 = (Button) findViewById(R.id.btn_image);
		b2 = (Button) findViewById(R.id.btn_Edit);
		
	
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
		
		String d1 = getIntent().getStringExtra("s1");
		String d2 = getIntent().getStringExtra("s2");
		String d3 = getIntent().getStringExtra("s3");
		String d4 = getIntent().getStringExtra("s4");
		String d5 = getIntent().getStringExtra("s5");
		String d6 = getIntent().getStringExtra("s6");
		
		
		if (t1 != null){
		t1.setText("onwara eiamtabtim");
		t2.setText("21");
		t3.setText("12/08/36");
		t4.setText("165cm");
		t5.setText("50kg");
		t6.setText("onwara6916@gmail.com");
		}
		if(d1!=null ){
		t1.setText(d1);
		t2.setText(d2);
		t3.setText(d3);
		t4.setText(d4);
		t5.setText(d5);
		t6.setText(d6);
		}
	}//&& d2!=null && d3!=null&& d4!=null&& d5!=null&& d6!=null
	public void onClick(View v) {
		
		switch (v.getId() ){
		case R.id.btn_image:
			Intent s = new Intent(MainActivity.this,ImageActivity.class);
			startActivity(s);
			
			break;
		case R.id.btn_Edit:
			Intent e = new Intent(MainActivity.this,EditActivity.class);
			startActivity(e);
			break;
		default:
			break;
		}
	}
	
}
