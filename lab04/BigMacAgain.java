//Fred Akoto
//September 17,2014
//lab04

import java.util.Scanner;
 public class BigMacAgain{ 
               
     //add main method
     public static void main(String[ ] args) {
      
       }  //end of main method
}  //end of class
 
    myScanner=new Scanner (System.in);
    System.out.print("Enter the number of Big Macs(an integer > 0) :");
    if (myScanner.hasNextInt() ){
    int nBigMacs = myScanner.nextInt ();
    }
    else{
    System.out.println("You did not enter an Int");
    return;    //leaves the program, i.e.
                    //the program terminates
    }
    System.out.print(" Do you want french fries?");
    String frenchfries = myScanner.next();
    if (frenchfries.equals("Y") || frenchfries.equals("y")){
    System.out.print("the cost of the french fries is $2.15");
    
    }
    else if(frenchfries.equals("N") || frenchfries.equals("n"))
    
       }
}