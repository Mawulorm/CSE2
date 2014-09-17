// Fred Akoto
// September 9th, 2014
// hw-02
// Bicycle Java Program 1
//This homework displays the number of counts on a cyclometer and the number of
//seconds during which the counts occurred,the distance 
//traveled, and the average miles per hour. 

import java.util.Scanner;
public class Bicycle {
 
 public static void main(String [ ] args) {
     Scanner myScanner;
     myScanner=new Scanner (System.in);
     System.out.print("Enter the number of counts on a cyclometer: ");
     int numCyclometer=myScanner.nextInt();

     System.out.print("Enter the number of seconds of trip: ");
     int seconds=myScanner.nextInt();
 
     double wheelDiameter=27.0, //
     PI=3.14159,//
     feetPerMile=5280,//
     inchesPerFoot=12,//
     secondsPerMinute=60;//
     double distanceTrip;
 
     distanceTrip=numCyclometer*wheelDiameter*PI;
     distanceTrip/=inchesPerFoot*feetPerMile;
  
     System.out.println("The distance was " + distanceTrip+" miles and took"+ (seconds/secondsPerMinute));
 
     double mph=distanceTrip/((seconds/secondsPerMinute)/60);
 
     System.out.println("The average mph was " +mph);
     
}
}