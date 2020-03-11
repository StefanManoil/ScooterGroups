// Class representing a generic location
public class Location {
  // fields
  private String id;
  private double longitudeX;
  private double latitudeY;
  
  // constructor
  public Location(String id, double longitudeX, double latitudeY) {
    this.id = id;
    this.longitudeX = longitudeX;
    this.latitudeY = latitudeY;
  }
  
  // getters
  public String getId() {
    return this.id;
  }
  public double getLongitudeX() {
    return this.longitudeX;
  }
  public double getLatitudeY() {
    return this.latitudeY;
  }
  
  // setters
  public void setId(String id) {
    this.id = id;
  }
  public void setLongitudeX(double longitudeX) {
    this.longitudeX = longitudeX;
  }
  public void setLatitudeY(double latitudeY) {
    this.latitudeY = latitudeY;
  }
  
  //toString
  @Override
  public String toString() { 
    return "{id: " + this.id + ", " + "Latitude: " + this.latitudeY + ", " + "Longitude: " + this.longitudeX + "}";
  }
}