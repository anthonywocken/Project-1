
/**
 * Anthony Wocken
 * 10/5/16
 * 
 * Program Description:
 * Implements approximations of e^x and sin(x) using the Taylor Series.
 */

public class WockenHW1

{
    
    // main method calls	
    public static void main(Str	ing[] args) {

        approximateEX();
        approximateSinX();
      
    }
    
    
    // Taylor Series for approximation of e^2 values
    public static void approximateEX() {   
        System.out.println("x" + "           " + "e^x");
        System.out.println("=" + "           " + "===");
        
        // loop for e^2 values
        // declares variables here to avoid nested loop interference
        for (double x = -3; x <= 3; x++) {
            double n = 1; // exponent and denominator
            double d = 1; // accumulator for denominator factorial
            double e = 1; // represents e^2, the overall fraction accumulator
            double k = 1; // factorial
            
            // adds Taylor Series quotients
            for (int i = 0; i < 30; i++) {
                d = d * n;      // denominator powering up 
                k = k * x;      // factorial update
                e = e + k / d;  // term
                n = n + 1;      // increment
            }
            System.out.println(x + "        " + e); // adds e^2 to list
            
        }
        System.out.println();
        System.out.println();
    } 
    
    
    
    // approximation of sin(x) values
    public static void approximateSinX() {   
        System.out.println("x" + "           " + "sin(x)");
        System.out.println("=" + "           " + "======");
        double x = Math.PI/2;
        int listCount = 1;              // number for list report
        // loop for sin(x) values
        // declares variables here to avoid nested loop interference
        for (double a = 1; a <= 4; a++) {
            
            double n = 1; // accumulator
            double d = 1; // accumulator for denominator factorial
            double e = 0; // overall fraction accumulator
            double k = 1; // numerator and factorial accumulator
            int t = -1; 
            
            // adds quotients
            for (int i = 0; i <= 30; i++) {
                t = t * -1;                         // alternates plus and minus terms
                e = e + t * (Math.pow(x, n) / d);   // fraction term update, numerator and denominator
                n = n + 2;                          // constant increment
                d = d * n * (n-1);                  // update denominator factorial
            }
            
    
            System.out.println(listCount + "PI/2       " + e); // adds sin(x) to list
            x = x + Math.PI/2;
            listCount++;
        }
    } 
}    