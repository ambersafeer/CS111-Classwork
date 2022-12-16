import StdOut;

public class ArrayFunctions {
    // library to manipulate arrays
// reference holds the address in memory of an array

    // creates and populates a double array of size "size"
    public static double[] createDoubleArrayAndPopulate (int size) {

        // create a double array of size slots
        double [] array = new double [size];

        // populate the array - initializing the array with random double values
        for (int i = 0; i < array.length; i++){
            array[i] = StdRandom.uniform(); // assign a random value to array position i
        }
        // return the array
        return array;
    }

    // received an array and prints its content
    public static void printDoubleArray (double[] array){

        // print it
        for (int i = 0; i < array.length; i++){
            StdOut.print(array[i] + " ");
        }
        // once the function ends, or reaches this line, it will go back to the caller
    }

    public static double sumDoubleArray (double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum; 
    }
}
