import java.io.*;
import java.util.*;
import java.lang.*;
public class GroupUps {
  public static void main(String[] args) {
    // main method running some tests
    
    // create scooter locations
    Coordinates scooter1 = new Coordinates(2, -4);
    Coordinates scooter2 = new Coordinates(10, -10);
    Coordinates scooter3 = new Coordinates(-6, -2);
    Coordinates scooter4 = new Coordinates(-1, 1);
    Coordinates scooter5 = new Coordinates(-1, 8);
    Coordinates scooter6 = new Coordinates(2, 3);
    Coordinates scooter7 = new Coordinates(10, 5);
    Coordinates scooter8 = new Coordinates(0, 0);
    Coordinates scooter9 = new Coordinates(0, 10);
    Coordinates[] scootersArr = {scooter1, scooter2, scooter3, scooter4, scooter5, scooter6, scooter7, 
                              scooter8, scooter9};
    
    // our test Coordinates
    Coordinates output;
    // call our groupUp method
    output = groupUp(scootersArr);
    System.out.println(output.toString());
    
  }
  
  // method that calculates the central coordinates of the scooter group
  public static Coordinates groupUp(Coordinates[] scooters) {
    double sumLongitudeX = 0;
    double sumLatitudeY = 0;
    double centralLongitudeX;
    double centralLatitudeY;
    for (int i = 0; i < scooters.length; i++) {
      sumLongitudeX += scooters[i].getLongitudeX();
      sumLatitudeY += scooters[i].getLatitudeY();
    }
    centralLongitudeX = sumLongitudeX / scooters.length;
    centralLatitudeY = sumLatitudeY / scooters.length;
    Coordinates centralCoordinates = new Coordinates(centralLongitudeX, centralLatitudeY);
    return centralCoordinates;
  }
}