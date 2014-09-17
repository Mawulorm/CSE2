//Fred Akoto 
//September 15, 2014
//Root java program
//This program displays a double, a crude estimate of the cube root of the number, and the value of this crude guess when cubed.

import java.util.Scanner;
public class Root {
 
    public static void main(String [ ] args) {
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    System.out.print("Enter a double: ");
    double number1=myScanner.nextInt();
 
    double number2=(number1)/3;
    System.out.println("and print its cube root" +number2);
 
    double guess=(number2*number2*number2+number1)/(3*number2*number2);
    
    System.out.println("The cube root is" +guess);
 }
}
