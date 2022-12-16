import StdOut;

public class ArrayFunctionsCaller {
    public static void main (String[] args){

        // create an array of size 30
        double [] testArray; // declaring a variable that refers to an array
        testArray = ArrayFunctions.createDoubleArrayAndPopulate(5);

        ArrayFunctions.printDoubleArray(testArray);
      
        StdOut.print(ArrayFunctions.sumDoubleArray(testArray));
    }
}
