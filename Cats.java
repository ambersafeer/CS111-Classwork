
public class Cats {

    // the main method is the entry point of your program
    // the interpreter will look for it to start execution
    public static void main (String args[]) {

        // declare two integer variables
        int anaCats;
        int ellenCats;

        // inputs to the program are passed through args
        // args [0] has the first input, args [1] has the second input
        // args[0] and args [1] are strings
        // Integer.parseInt converts a String into an Integer
        anaCats = Integer.parseInt(args[0]);
        ellenCats = Integer.parseInt(args[1]);

        // () around the boolean expression (BE)
        // || means OR
        if (anaCats < 0 || ellenCats < 0) {
            // this part is executed if BE is true
            System.out.println("Error: what did you do to them....");
        } else {
            // this part is executed if BE is false
            int totalCats = anaCats + ellenCats; // variable declaration and variable assignment
            System.out.println("Total number of cats " + totalCats);
        }
        }
        // " " denotes a string
        // ' ' denotes a character
    }
