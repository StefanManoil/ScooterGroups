import java.io.*;
import java.util.*;
import java.lang.*;
public class ScooterGroups {
  public static void main(String[] args) {
    // main method running some tests
    
    // first create the ports
    Location portA = new Location("A", -6, 3);
    Location portB = new Location("B", 6, 7);
    Location portC = new Location("C", -1, -8);
    Location[] portsArr = {portA, portB, portC};
    
    // then create scooter locations
    Location scooter1 = new Location("S1", 2, -4);
    Location scooter2 = new Location("S2", 10, -10);
    Location scooter3 = new Location("S3", -6, -2);
    Location scooter4 = new Location("S4", -1, 1);
    Location scooter5 = new Location("S5", -1, 8);
    Location scooter6 = new Location("S6", 2, 3);
    Location scooter7 = new Location("S7", 10, 5);
    Location scooter8 = new Location("S8", 0, 0);
    Location scooter9 = new Location("S9", 0, 10);
    Location[] scootersArr = {scooter1, scooter2, scooter3, scooter4, scooter5, scooter6, scooter7, 
                              scooter8, scooter9};
    
    // our test ArrayList of ArrayList
    ArrayList<ArrayList<Location>> output;
    // call our scooterInLocations method
    output = scootersInLocations(portsArr, scootersArr);
    
    // print output
    for (int i = 0; i < output.size(); i++) {
      for (int j = 0; j < output.get(i).size(); j++) {
        Location current = output.get(i).get(j);
        System.out.print(current.toString());
      }
      System.out.println();
    }
    //System.out.println(Arrays.deepToString(output.toArray()));
    // ^^ tried to print using a default message but we have ArrayList of ArrayList 
    //    of locations and this just returns the object addresses.
  }
  
  // distance calculation between two Locations
  public static double distanceBetweenLoc(Location loc1, Location loc2) {
    return Math.sqrt(Math.pow((loc2.getLongitudeX() - loc1.getLongitudeX()), 2) + 
                     Math.pow((loc2.getLatitudeY() - loc1.getLatitudeY()), 2));
  }
  
  // method to match the closest scooters to their appropriate port
  public static ArrayList<ArrayList<Location>> scootersInLocations(Location[] ports, Location[] scooters) {
    ArrayList<ArrayList<Location>> portsLinkedToScooters = new ArrayList<ArrayList<Location>>(ports.length);
    
    // we know that we will have as many ArrayLists as ports so we can add them right away
    for (int i = 0; i < ports.length; i++) {
      ArrayList<Location> tmp = new ArrayList<Location>(1);
      tmp.add(ports[i]);
      portsLinkedToScooters.add(tmp);
    }
    
    // calculate the shortestDistance of the current scooter to the ports and
    // get the port that is closest to the current scooter
    for (int i = 0; i < scooters.length; i++) {
      double shortestDistance = Double.MAX_VALUE;
      int portLinkIndex = 0;
      for (int j = 0; j < ports.length; j++) {
        double currentDistance = distanceBetweenLoc(scooters[i], ports[j]);
        if (currentDistance < shortestDistance) {
          shortestDistance = currentDistance;
          portLinkIndex = j;
        }
      }
      // add the current scooter to the appropriate port in the "interior" ArrayLists
      portsLinkedToScooters.get(portLinkIndex).add(scooters[i]);
    }
    return portsLinkedToScooters;
  }
}