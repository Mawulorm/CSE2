// Fred Akoto 
// HW-06
// This program computes the loss, win, and reward of a gambler using 
// random values.

import java.util.Scanner;

public class Roulette {
    public static void main(String [ ] args) {
        
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter your bet for number between 1 and 38"); // user enters his own number
        int bet=myScanner.nextInt();
        int simulation=1;  // original simulation value
        int allwins=0; // original total wins value
        int losses=0;  // original value for losses
        int gain=0;  // original value for prizes
        
        if (bet < 38 && bet > 0) {
            // the above makes sure that the number entered is between 1 and 38
            while (simulation <=1000) {
                int wins=0;
                int num=(int)(Math.random()*38); // this is the random number generator
                // which keeps the value between 1 and 38
                int rolls=1; // tells us the rolls performed
                
        while(rolls<=100){
            if (num==bet) {
                allwins++;
                wins++;
            }
            rolls++; }
            if (wins==0){
                losses++;
                // the above checks if the gambler loses and calculates his losses
            }
            else if (wins >=1){
                gain++;
                // the above checks if the gambler makes any wins and calculates his reward
            }
            simulation++;
        }
        
        System.out.println("You have won $" +gain*36);
        System.out.println("You have won " +allwins+ " times");
        System.out.println("You lost " +losses+ " times");
            }
            else {
                System.out.println("You did not enter a bet between 1 and 38");
            }
            
        }
}