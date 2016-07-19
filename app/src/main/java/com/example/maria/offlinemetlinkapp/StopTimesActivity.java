package com.example.maria.offlinemetlinkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

/**
 * Created by Sami on 17/07/2016.
 */
public class StopTimesActivity extends AppCompatActivity {
	ListView mainListView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stop_times_content);

		mainListView = (ListView) findViewById(R.id.mainListView);

		setupList();
	}

	private void setupList(){
		ArrayAdapter<String> stopsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Arrays.asList("foo", "bar", "metro"));
		mainListView.setAdapter(stopsAdapter);
		mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				Toast.makeText(StopTimesActivity.this, mainListView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
			case android.R.id.home:
				onBackPressed();
				return true;
		}

		return super.onOptionsItemSelected(item);
	}
}