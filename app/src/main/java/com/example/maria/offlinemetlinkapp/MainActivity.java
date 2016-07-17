package com.example.maria.offlinemetlinkapp;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.maria.offlinemetlinkapp.helper.DatabaseHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button stopBtn, routeBtn;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stopBtn =(Button)findViewById(R.id.go);
        routeBtn =(Button)findViewById(R.id.altGo);

        db = new DatabaseHelper(getApplicationContext());
        if (db.isEmpty(db.getReadableDatabase())) {
            AssetManager assets = getApplicationContext().getAssets();
            try {
                String[] file_names = {"metlink_routes.sql", "metlink_stop_times.sql", "metlink_stops.sql", "metlink_trips.sql"};
                for (int count = 0; count < file_names.length; count++) {
                    String file_name = file_names[count];
                    InputStream input = assets.open(file_name);
                    Scanner scanner = new Scanner(input);
                    scanner.useDelimiter(";\\n");
                    while (scanner.hasNext()) {
                        db.execStatement(db.getWritableDatabase(), scanner.next());
                    }
                }
            } catch (IOException e) {
            }
        }

        // Spinner element
        final Spinner s = (Spinner) findViewById(R.id.spinner);

        //button for entering stop number
        stopBtn.setOnClickListener(new View.OnClickListener() {
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
        assert s != null;
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

                String items=s.getSelectedItem().toString();
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
        s.setAdapter(dataAdapter);

        //update database
        //DataController dataController = new DataController();
        //dataController.updateDatabase(getAssets());
    }

    public ArrayList getRoutes(){
        return new ArrayList(8);
    }
}
