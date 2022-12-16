import StdOut;

// this is a library
// collection of functions that provides functionalities
public class NumProbs {

    // number is the parameter: input to the function
    public static int factorial (int number) { // function's signature
        //funtction's body

        int result = 1;
        for ( int n = 2; n <= number; n++){
            result *= n;
        }
        return result; // returning the value stored in result
    }

    // function that doesn't retrun a value

    public static void myPrint (String value) {
        StdOut.println(value);
        return; // not returning any value: just goes back to the caller.
    }
    // function to count the number of digits in an integer
    // input is a number
    public static int numberOfDigits (int number) {

        // function's body
        int count = 0;
        while (number > 0){
            count+=1;
            // integer division
            number/= 10; // removes the last digit
        }
        // return the number of digits
        return count;
    }
}
