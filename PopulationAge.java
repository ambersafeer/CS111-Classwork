import StdOut;

public class PopulationAge {
    public static void main (String[] args){

        //StdOut.print("How many people in your town? ");
        int nbrPeople = Integer.parseInt(args[0]);//StdIn.readInt();

        // generate nbrPeople between age 0 - 120 years old
        for ( int i = 0; i < nbrPeople; i++){
            StdOut.println((int)(Math.random()*120));
        }
    }
}
