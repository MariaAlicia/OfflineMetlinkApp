package com.example.maria.offlinemetlinkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

/**
 * Created by Sami on 17/07/2016.
 */
public class StopTimesActivity extends AppCompatActivity {
	ListView mainListView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.route_content);

		mainListView = (ListView)findViewById(R.id.mainListView);
		ArrayAdapter<String> stopsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Arrays.asList("foo", "bar", "metro"));
		mainListView.setAdapter(stopsAdapter);
	}
}