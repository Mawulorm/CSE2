//Fred Akoto 
//September 15, 2014
//FourDigit java program

import java.util.Scanner;
public class FourDigits {
    
    public static void main(String [ ] args) {
    Scanner myScanner; // produces new scanner object
    myScanner=new Scanner (System.in); // instantiates this object
    System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
    // the user inputs value here
    double number1=myScanner.nextDouble();
    int number2=(int)number1;
    number2*=10000;
    double newNum=(number1*10000);
    
    

    
    System.out.println("The four digits are" +(-(number2-newNum)) );
    }
}
