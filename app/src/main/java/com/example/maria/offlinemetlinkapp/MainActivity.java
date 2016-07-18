package com.example.maria.offlinemetlinkapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button stopBtn, routeBtn;
    EditText stopInput;
    Spinner routeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);

	    stopBtn =(Button)findViewById(R.id.stopGo);
	    routeBtn =(Button)findViewById(R.id.routeGo);
	    stopInput = (EditText)findViewById(R.id.stopInput);
	    routeSpinner = (Spinner)findViewById(R.id.routeSpinner);
	    setupListeners();
	    setupKeyboardHide(findViewById(R.id.parentLayout));
    }

	private void setupListeners(){
        //Button for entering stop number
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*setContentView(R.layout.route_content);
                ListView mainListView = (ListView) findViewById( R.id.mainListView );
                String[] times = new String[]{};//from method
                ArrayList<String> busTimes = new ArrayList<String>();
                busTimes.addAll( Arrays.asList(times));
                ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, busTimes);
                mainListView.setAdapter( listAdapter );*/

	            String stopId = stopInput.getText().toString();

	            if(stopId.length() < 4){
		            Toast.makeText(MainActivity.this, "Invalid stop", Toast.LENGTH_SHORT).show();
		            return;
	            }

	            Intent i = new Intent(getApplicationContext(), StopTimesActivity.class);
	            startActivity(i);
            }
        });

        //Button for when selecting route from drop down
        routeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.route_content);
                ListView mainListView = (ListView) findViewById( R.id.mainListView );
                String[] times = new String[]{};//from method
                ArrayList<String> busTimes = new ArrayList<String>();
                busTimes.addAll( Arrays.asList(times));
                ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, busTimes);
                mainListView.setAdapter( listAdapter );
            }
        });

        // Spinner click listener
        routeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

                String items=routeSpinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        // Spinner Drop down elements (Routes on start up)
        List<String> route = new ArrayList<String>();//replace this with the getRoutes()
        route.add("Automobile");
        route.add("Business Services");
        route.add("Computers");
        route.add("Education");
        route.add("Personal");
        route.add("Travel");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, route);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        routeSpinner.setAdapter(dataAdapter);

        //update database
        //DataController dataController = new DataController();
        //dataController.updateDatabase(getAssets());
    }

	public static void hideSoftKeyboard(Activity activity) {
		InputMethodManager inputMethodManager = (InputMethodManager)  activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
		inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
	}

	public void setupKeyboardHide(View view) {

		//Set up touch listener for non-text box views to hide keyboard.
		if(!(view instanceof EditText)) {

			view.setOnTouchListener(new View.OnTouchListener() {

				public boolean onTouch(View v, MotionEvent event) {
					hideSoftKeyboard(MainActivity.this);
					return false;
				}

			});
		}

		//If a layout container, iterate over children and seed recursion.
		if (view instanceof ViewGroup) {

			for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {

				View innerView = ((ViewGroup) view).getChildAt(i);

				setupKeyboardHide(innerView);
			}
		}
	}

    public ArrayList getRoutes(){
        return new ArrayList(8);
    }
}
