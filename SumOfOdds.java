public class SumOfOdds {
    public static void main (String[] args){

        // sum of odd numbers between x and y
        // pre condition is that x and y are integers

        int x = Integer.parseInt(args[0]); // declaring x to be of type int. Storing user input into x
        int y = Integer.parseInt(args[1]);
        int sum = 0; // summing variable

        while ( x < y ) {

            if ( x % 2 != 0 ) {
                // number is odd
                sum = sum + x; // the same as sum+= x;
            }
            x = x + 1; // same as x += 1;
        }
        System.out.println(sum);
    }
}
