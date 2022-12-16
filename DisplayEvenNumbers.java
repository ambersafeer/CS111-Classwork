public class DisplayEvenNumbers {
    public static void main (String[] args) {
        int number = 1;

        while ( number < 100 ){ // boolean expression
            // while loop's body is executed every time the boolean expression is true

            if ( number % 2 == 0 ) {
                // number is even
                System.out.print(number + " ");
                // doing it on print instead of println puts it all on the same line, not a new line
            }
            number += 1;
        }
    }
}
