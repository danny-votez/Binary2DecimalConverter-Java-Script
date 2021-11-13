// The following script illustrates Binary to Decimal Conversion
// To complete this, we rely on parseInt() method
// Also, there is reliance on Scanner class for gettin user input
// This script ensures that there is;
// Input Validation using Scanner class
// To complete the validation, Scanner's hasNext() method is used
// After validation, there is subsequent conversion of Binary to Decimal

import java.util.*;

class Bin2Dec{
    public static void main(String[] args){
        // Getting User input, first by creating a Scanner object
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter Binary to Convert: ");

        // "[0-1"] helps in checking that the string entry contains 0's and 1's only, or either
        if (entry.hasNext("[0-1]*")){
            String input = entry.nextLine();
            System.out.println("You entered right Binary of: " + input);

            // If the validation is correct/right, then Binary to Decimal conversion occurs
            // The line below prints the result onto the screen
            System.out.println("The Decimal Equivalent is: " + Integer.parseInt(input, 2));
        }
        // If the above condition fails, in that input is not either 0 or 1, the below code executes
        else {
            System.out.println("Sorry, One or more entries is not in 1's and/or 0's.");
            String input = entry.nextLine();
        }
    }
}