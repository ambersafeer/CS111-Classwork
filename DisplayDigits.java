public class DisplayDigits {
    
    public static void main (String[] args) {
        int number = 234; //Integer.parseInt(args[0]);

        for ( ; number > 0; number = number / 10) {
        //while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");

        }

    }
}
