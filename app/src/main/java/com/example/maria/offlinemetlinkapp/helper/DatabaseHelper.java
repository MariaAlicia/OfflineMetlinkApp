package com.example.maria.offlinemetlinkapp.helper;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by mgoo on 6/07/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String LOG = "DatabaseHelper";

    //Database Version
    private static final int DATABASE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "metlink";

    //Table Names
    private static final String TABLE_TRIP = "trips";
    private static final String TABLE_STOP = "stops";
    private static final String TABLE_STOP_TIME = "stop_times";
    private static final String TABLE_ROUTE = "routes";

    //Primary Keys
    private static final String KEY_TRIP = "trip_id";
    private static final String KEY_STOP = "stop_id";
    private static final String KEY_STOP_TIME = "stop_time_id";
    private static final String KEY_ROUTE = "route_id";

    private static final String CREATE_TABLE_TRIP = "";
    private static final String CREATE_TABLE_STOP = "";
    private static final String CREATE_TABLE_STOP_TIME = "";
    private static final String CREATE_TABLE_ROUTE = "";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Creates all the Tables
     * @param db SQLiteDatabase object
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DatabaseValues.TABLE_TRIP.CREATE_TABLE_TRIP);
        db.execSQL(DatabaseValues.TABLE_STOP.CREATE_TABLE_STOP);
        db.execSQL(DatabaseValues.TABLE_STOP_TIME.CREATE_TABLE_STOP_TIME);
        db.execSQL(DatabaseValues.TABLE_ROUTE.CREATE_TABLE_ROUTE);
    }

    /**
     * upGrades the Database by dropping the old version and creating a new one
     * @param db SQLiteDatabase object
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TRIP);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STOP);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STOP_TIME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ROUTE);

        // create new tables
        onCreate(db);
    }

    public boolean execStatement(SQLiteDatabase sqLiteDatabase, String statement){
        sqLiteDatabase.execSQL(statement);
        return true;
    }

    public boolean isEmpty(SQLiteDatabase sqLiteDatabase){
        Cursor c = sqLiteDatabase.rawQuery("SELECT * FROM `" + DatabaseValues.TABLE_TRIP_NAME + "`;", null);
        boolean isEmpty = (c.getCount() == 0);
        c.close();
        return isEmpty;
    }


}
