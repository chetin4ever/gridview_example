package com.example.gridviewapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        GridView gridview= (GridView) findViewById(R.id.grid_view);
        gridview.setAdapter(new ImageAdapter(MainActivity.this));
        gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent , View v, int poistion,
					long id) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(MainActivity.this,SingleActivity.class);
				i.putExtra("id", poistion);
				startActivity(i);
			}
        	
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
