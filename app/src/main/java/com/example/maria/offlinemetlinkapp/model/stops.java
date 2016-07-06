package com.example.maria.offlinemetlinkapp.model;

/**
 * Created by bobl on 7/6/16.
 */
public class stops {

    int stopId;
    int stopCode;
    String stopName;
    String stopDesc;
    double stopLat;
    double stopLon;
    int zoneId;
    String stopUrl;
    int locationType;
    String parentStation;
    String stopTimezone;

    public stops(int stop_id,int stop_code,String stop_name,String stop_desc, double stop_lat,double stop_lon,int zone_id,String stop_url,int location_type,String parent_station,String stop_timezone){
        int stopId = stop_id;
        int stopCode = stop_code;
        String stopName = stop_name;
        String stopDesc = stop_desc;
        double stopLat = stop_lat;
        double stopLon = stop_lon;
        int zoneId = zone_id;
        String stopUrl = stop_url;
        int locationType = location_type;
        String parentStation = parent_station;
        String stopTimezone = stop_timezone;
    }

    //------getter----------------

    public int getStopId() {
        return stopId;
    }

    public int getStopCode() {
        return stopCode;
    }

    public String getStopName() {
        return stopName;
    }

    public String getStopDesc() {
        return stopDesc;
    }

    public double getStopLat() {
        return stopLat;
    }

    public double getStopLon() {
        return stopLon;
    }

    public int getZoneId() {
        return zoneId;
    }

    public String getStopUrl() {
        return stopUrl;
    }

    public int getLocationType() {
        return locationType;
    }

    public String getParentStation() {
        return parentStation;
    }

    public String getStopTimezone() {
        return stopTimezone;
    }
    //------setter----------------

    public void setStopId(int stopId) {
        this.stopId = stopId;
    }

    public void setStopCode(int stopCode) {
        this.stopCode = stopCode;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public void setStopDesc(String stopDesc) {
        this.stopDesc = stopDesc;
    }

    public void setStopLat(double stopLat) {
        this.stopLat = stopLat;
    }

    public void setStopLon(double stopLon) {
        this.stopLon = stopLon;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public void setStopUrl(String stopUrl) {
        this.stopUrl = stopUrl;
    }

    public void setLocationType(int locationType) {
        this.locationType = locationType;
    }

    public void setParentStation(String parentStation) {
        this.parentStation = parentStation;
    }

    public void setStopTimezone(String stopTimezone) {
        this.stopTimezone = stopTimezone;
    }
}
