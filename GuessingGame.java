import StdOut;

public class GuessingGame {
    public static void main (String[] args){
        int n = (int)(Math.random() * 1000)+1;
        StdOut.println("Guess a number between 1 and 1,000: ");
        int input = 0;
        while (input != n){
           input = StdIn.readInt();
            if (input < n){
                StdOut.println("guess is too low!");
            }
            if (input > n){
                StdOut.println("guess is too high!");
            }
        }
        StdOut.println("You win!!!!!!!!!!!");
    }
}
