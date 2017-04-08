package com.roadsideemergencies.vik.roademergencies;

public class GPSTracker{
    private double latitude; // latitude
    private double longitude;

    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
