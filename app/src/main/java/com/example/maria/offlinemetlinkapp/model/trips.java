package com.example.maria.offlinemetlinkapp.model;

/**
 * Created by bobl on 7/6/16.
 */
public class trips {

    int routeId;
    int serviceId;
    String tripId;
    String tripHeadsign;
    int directionId;
    String blockId;
    String shapeId;
    String wheelchairAccessible;
    int bikesAllowed;
    
    public trips(int route_id,int service_id,String trip_id,String trip_headsign,int direction_id,String block_id,String shape_id,String wheelchair_accessible,int bikes_allowed){
        routeId = route_id;
        serviceId = service_id;
        tripId = trip_id;
        tripHeadsign = trip_headsign;
        directionId = direction_id;
        blockId = block_id;
        shapeId = shape_id;
        wheelchairAccessible =wheelchair_accessible;
        bikesAllowed = bikes_allowed;
    }

    //------getter----------------

    public int getRouteId() {
        return routeId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getTripId() {
        return tripId;
    }

    public String getTripHeadsign() {
        return tripHeadsign;
    }

    public int getDirectionId() {
        return directionId;
    }

    public String getBlockId() {
        return blockId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public String getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public int getBikesAllowed() {
        return bikesAllowed;
    }

    //------setter----------------

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }

    public void setDirectionId(int directionId) {
        this.directionId = directionId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public void setWheelchairAccessible(String wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
    }

    public void setBikesAllowed(int bikesAllowed) {
        this.bikesAllowed = bikesAllowed;
    }
}
