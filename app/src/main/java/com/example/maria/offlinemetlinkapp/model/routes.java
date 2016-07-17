package com.example.maria.offlinemetlinkapp.model;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by bobl on 7/6/16.
 */
class routes {

    String routeId;
    String routeShortName;
    String routeLongName;
    String routeDesc;
    int routeType;
    String routeUrl;
    String routeColor;
    String routeTextColor;

    //------constructors----------------

    public routes(){
    }

    protected routes(String route_id, String route_short_name, String route_long_name, String route_desc,int route_type, String route_url,String route_color, String route_text_color){
        routeId = route_id;
        routeShortName = route_short_name;
        routeLongName = route_long_name;
        routeDesc = route_desc;
        routeType = route_type;
        routeUrl = route_url;
        routeColor = route_color;
        routeTextColor = route_text_color;
    }

    //------getters----------------

    public String getRouteId() {
        return routeId;
    }

    public String getRouteShortName() {
        return routeShortName;
    }

    public String getRouteLongName() {
        return routeLongName;
    }

    public String getRouteDesc() {
        return routeDesc;
    }

    public int getRouteType() {
        return routeType;
    }

    public String getRouteUrl() {
        return routeUrl;
    }

    public String getRouteColor() {
        return routeColor;
    }

    public String getRouteTextColor() {
        return routeTextColor;
    }

    //------setters----------------

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public void setRouteLongName(String routeLongName) {
        this.routeLongName = routeLongName;
    }

    public void setRouteDesc(String routeDesc) {
        this.routeDesc = routeDesc;
    }

    public void setRouteType(int routeType) {
        this.routeType = routeType;
    }

    public void setRouteUrl(String routeUrl) {
        this.routeUrl = routeUrl;
    }

    public void setRouteColor(String routeColor) {
        this.routeColor = routeColor;
    }

    public void setRouteTextColor(String routeTextColor) {
        this.routeTextColor = routeTextColor;
    }
}
