import StdOut;

public class NumProbsCaller {
    
    public static void main (String[] args){ // function signature

        // call the numberOfDigits function
        int nbr = NumProbs.numberOfDigits(7829482);
        StdOut.println(nbr);
        

        nbr = NumProbs.numberOfDigits(564);
        StdOut.println(nbr);

        int fact = NumProbs.factorial(5);
        NumProbs.myPrint("Factorial of " + 5 + " is " + fact);
        }
}
 