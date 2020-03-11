// Class representing coordinates
public class Coordinates {
  // fields
  private double longitudeX;
  private double latitudeY;
  
  // constructor
  public Coordinates(double longitudeX, double latitudeY) {
    this.longitudeX = longitudeX;
    this.latitudeY = latitudeY;
  }
  
  // getters
  public double getLongitudeX() {
    return this.longitudeX;
  }
  public double getLatitudeY() {
    return this.latitudeY;
  }
  
  // setters
  public void setLongitudeX(double longitudeX) {
    this.longitudeX = longitudeX;
  }
  public void setLatitudeY(double latitudeY) {
    this.latitudeY = latitudeY;
  }
  
  //toString
  @Override
  public String toString() { 
    return "{Latitude: " + this.latitudeY + ", " + "Longitude: " + this.longitudeX + "}";
  } 
}