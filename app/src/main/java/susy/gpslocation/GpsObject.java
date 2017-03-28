package susy.gpslocation;

/**
 * Created by susy on 28/03/17.
 */

public class GpsObject {

    String Latitude;
    String Longitude;
    String Street;


    public GpsObject(String latitude, String longitude, String street) {
        Latitude = latitude;
        Longitude = longitude;
        Street = street;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    @Override
    public String toString() {
        return "GpsObject{" +
                "Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Street='" + Street + '\'' +
                '}';
    }
}
