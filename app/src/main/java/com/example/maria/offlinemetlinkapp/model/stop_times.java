package com.example.maria.offlinemetlinkapp.model;

/**
 * Created by bobl on 7/6/16.
 */
public class stop_times {
    /*
   `trip_id` text,
  `arrival_time` text,
  `departure_time` text,
  `stop_id` int(11) DEFAULT NULL

    * */
    String tripId;
    String arrivalTime;
    String departureTime;
    int stopId;
    public stop_times(String trip_id,String arrival_time,String departure_time,int stop_id){
        tripId = trip_id;
        arrivalTime = arrival_time;
        departureTime = departure_time;
        stopId = stop_id;
    }
    //------setters---------------------
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setStopId(int stopId) {
        this.stopId = stopId;
    }
    //------getters---------------------
    public String getTripId() {
        return tripId;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getStopId() {
        return stopId;
    }
}
