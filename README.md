### Binary2Decimal Converter Script Using Java
#### Project Outcomes/Expectations
- Get user input, as String, one of the secondary/derived/reference data types
- Validate user input, to ensure only Binary elements, that is: 0's and 1's are entered
- Conversion of Binary entries into Decimal
- The Binary to Decimal conversion is based on Console Interface

#### Notes/Preamble
- This project script builds from "app ideas" by <b> Florin Pop </b> accessible from: https://github.com/florinpop17/app-ideas
- This Binary2Decimal script is based on first exercise <a href="https://github.com/florinpop17/app-ideas/blob/master/Projects/1-Beginner/Bin2Dec-App.md">Bin2Dec</a> , only that this focuses is on Java.

#### Script Explanation
- The Java Script illustrates Binary to Decimal Conversion
- To complete this, we rely on <strong>parseInt()</strong> method
- Also, there is reliance on <strong>Scanner class</strong> for gettin user input
- This script ensures that there is input Validation using Scanner class
- To complete the validation, Scanner's hasNext() method is used
- To validate a String value, there is using "regex" to get string in a specific format.
- In the script, the <strong>hasNext()</strong> takes a regex in validating if the user input string contains Binary values.
- It is only after the successful validation, that there is subsequent conversion of Binary to Decimal
- If the validation fails, i.e., entry elements are neither 0's or 1's, the <strong>"else"</strong> statement executes.

#### Below is the Java Console Interface Script
<pre>
<code>
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
</code>
</pre>

