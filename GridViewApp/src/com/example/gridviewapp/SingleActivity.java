package com.example.gridviewapp;

import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class SingleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single);
		
		Intent i = getIntent();
		int position = i.getExtras().getInt("id");
		ImageAdapter imageAdapter = new ImageAdapter(SingleActivity.this);
		ImageView imageView =(ImageView) findViewById(R.id.imageView1);
		imageView.setImageResource(imageAdapter.mThumbIds[position]);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.single, menu);
		return true;
	}

}
