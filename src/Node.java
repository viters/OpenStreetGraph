/**
 * Created by Viters on 2016-10-13.
 */
public class Node {
    private long id;
    private double lon;
    private double lat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "ID:" + id + " | LON: " + lon + " | LAT: " + lat;
    }
}