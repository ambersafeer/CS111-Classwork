public class Arrays {
    public static void main (String[]args){

        int numberOfValues = args.length; //number of arguments from the command line
        System.out.println("Number of values entered: " + numberOfValues);

        // traverse or iterate through the array args and print values
        for ( int i = 0; i < numberOfValues; i++){
            // scope of variables: i is only visible inside the for loop
            System.out.println("[" + i + "]:" + args[i]);
        }

        // declare and create an integer array with numberOfValues slots
        int[] intArray = new int[numberOfValues];

        // fill up the array with values from the command line
        // intArray is the args array converted into integers
        for ( int i = 0; i < numberOfValues; i++ ){
            intArray[i] = Integer.parseInt(args[i]);
        }

        // sum all of the values in intArray
        int sum = 0; // initialize to 0
        for ( int i = 0; i < intArray.length; i++){
            sum += intArray[i]; // same as sum = sum + intArray[i];
        
        }
        System.out.println("The sum is " + sum);

        // create a new array and fill it up with random numbers
        
        double [] doubleArray = new double[100];
        double total = 0.0;
        for ( int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Math.random();//returns a random number between (0.0, 1.0)
            total += doubleArray[i];
        }
        double avg = total / doubleArray.length;
        System.out.println("Average of doubleArray is " + avg);

        int count = 0;
        for (int i = 0; i < doubleArray.length; i++){
            if ( doubleArray[i] > avg ){
                count++;
            }
        }
        System.out.println("Number of values greater than the average is " + count );
        
    }
}
