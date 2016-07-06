package com.example.maria.offlinemetlinkapp.helper;

/**
 * Created by mgoo on 6/07/16.
 */
public class DatabaseValues {
    private static DatabaseValues ourInstance = new DatabaseValues();

    public static DatabaseValues getInstance() {
        return ourInstance;
    }

    private DatabaseValues() {
    }

    public static final String DATABASE_NAME = "metlink";

    public static final String TABLE_TRIP_NAME = "trips";
    public static final String TABLE_STOP_NAME = "stops";
    public static final String TABLE_STOP_TIME_NAME = "stop_times";
    public static final String TABLE_ROUTE_NAME = "trips";

    public static TABLE_TRIP TABLE_TRIP = new TABLE_TRIP();
    public static TABLE_STOP TABLE_STOP = new TABLE_STOP();
    public static TABLE_STOP_TIME TABLE_STOP_TIME = new TABLE_STOP_TIME();
    public static TABLE_ROUTE TABLE_ROUTE = new TABLE_ROUTE();

    static class TABLE_TRIP{
        protected final String COLUMB_TRIP_ID = "trip_id";
        protected final String COlUMB_ROUTE_ID = "route_id";
        protected final String COLUMB_SERVICE_ID = "service_id";
        protected final String COLUMB_TRIP_HEADSIGN = "trip_headsign";
        protected final String COLUMB_DIRECTION_ID = "direction_id";
        protected final String COLUMB_BLOCK_ID = "block_id";
        protected final String COLUMB_SHAPE_ID = "shape_id";
        protected final String COLUMB_WHEELCHAIR_ACCESSIBILE = "wheelchair_accessible";
        protected final String COLUMB_BIKES_ALLOWED = "bikes_allowed";

        protected final String[] ALL_COLUMBS = {COLUMB_TRIP_ID, COlUMB_ROUTE_ID, COLUMB_SERVICE_ID, COLUMB_TRIP_HEADSIGN,
            COLUMB_TRIP_HEADSIGN, COLUMB_DIRECTION_ID, COLUMB_BLOCK_ID, COLUMB_SHAPE_ID, COLUMB_WHEELCHAIR_ACCESSIBILE, COLUMB_BIKES_ALLOWED};

        protected TABLE_TRIP(){
            //empty
        }
    }

    static class TABLE_STOP{
        protected final String COLUMB_STOP_ID = "stop_id";
        protected final String COlUMB_STOP_CODE = "stop_code";
        protected final String COLUMB_STOP_NAME = "stop_name";
        protected final String COLUMB_STOP_DESC = "stop_desc";
        protected final String COLUMB_STOP_LAT = "stop_lat";
        protected final String COLUMB_STOP_LON = "stop_lon";
        protected final String COLUMB_ZONE_ID = "zone_id";
        protected final String COLUMB_STOP_URL = "stop_url";
        protected final String COLUMB_LOCATION_TYPE = "location_type";
        protected final String COLUMB_PARENT_STATION = "parent_station";
        protected final String COLUMB_STOP_TIMEZONE = "stop_timezone";

        protected final String[] ALL_COLUMBS = {COLUMB_STOP_ID, COlUMB_STOP_CODE, COLUMB_STOP_NAME, COLUMB_STOP_DESC, COLUMB_STOP_LAT, COLUMB_STOP_LON,
            COLUMB_ZONE_ID, COLUMB_STOP_URL, COLUMB_LOCATION_TYPE, COLUMB_PARENT_STATION, COLUMB_STOP_TIMEZONE};

        protected TABLE_STOP(){
            //empty
        }
    }

    static class TABLE_STOP_TIME{
        protected final String COLUMB_STOP_TIME_ID = "stop_time_id";
        protected final String COlUMB_TRIP_ID = "trip_id";
        protected final String COLUMB_ARRIVAL_TIME = "arrival_time";
        protected final String COLUMB_DEPARTURE_TIME = "departure_time";
        protected final String COLUMB_STOP_ID = "stop_id";

        protected final String[] ALL_COLUMBS = {COLUMB_STOP_TIME_ID, COlUMB_TRIP_ID, COLUMB_ARRIVAL_TIME, COLUMB_DEPARTURE_TIME, COLUMB_STOP_ID};

        protected TABLE_STOP_TIME(){
            //empty
        }
    }

    static class TABLE_ROUTE{
        protected final String COLUMB_ROUTE_ID = "route_id";
        protected final String COLUMB_AGENCY_ID = "agency_id";
        protected final String COLUMB_ROUTE_SHORT_NAME = "route_short_name";
        protected final String COLUMB_ROUTE_LONG_NAME = "route_long_name";
        protected final String COLUMB_ROUTE_DESC = "route_desc";
        protected final String COLUMB_ROUTE_TYPE = "route_type";
        protected final String COLUMB_ROUTE_URL = "route_url";
        protected final String COLUMB_ROUTE_COLOR = "route_color";
        protected final String COLUMB_ROUTE_TEXT_COLOR = "route_text_color";

        protected final String[] ALL_COLUMBS = {COLUMB_ROUTE_ID, COLUMB_AGENCY_ID, COLUMB_ROUTE_SHORT_NAME, COLUMB_ROUTE_LONG_NAME, COLUMB_ROUTE_DESC,
            COLUMB_ROUTE_TYPE, COLUMB_ROUTE_URL, COLUMB_ROUTE_COLOR, COLUMB_ROUTE_TEXT_COLOR};

        protected TABLE_ROUTE(){
            //empty
        }
    }
}
