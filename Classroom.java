import StdOut;

public class Classroom{
 public static void main (String[] args) {
    
    //System.out.print("How many students in this class? ");
    int nbrStudents = StdIn.readInt(); // reads an integer from the keyboard

    // one dimensional array for students to stand in line before coming inside the classroom
    String[] inLine = new String[nbrStudents];

    // traversing the array, asking for the array, storing student on array
    for ( int i = 0; i < inLine.length; i++){

      // System.out.print("Enter student " + (i+1) + "'s name: " );
        inLine[i] = StdIn.readString(); // reads a string from the keyboard
    }
    // print students in line using the enhanced for loop (foreach loop)
    /*for ( int i = 0; i < inLine.length; i++){
        String stu = inLine[i];
        System.out.print(stu + " - ");
    }*/
    for (String stu : inLine ){
        // stu is assigned a value from the array at each iteration
        // starts at index 0
        System.out.print(stu + " - ");
    }
    //System.out.println("Number of classroom rows: ");
    int rows = StdIn.readInt();
    //System.out.println("Number of columns: ");
    int columns = StdIn.readInt();

    // create a 2D array to emulate a classroom with seats!

    String[][] room = new String[rows][columns];

    // add students from line into room in row-major order
    // this emulates the students coming into the classroom
    // in a single line and sitting in the first row until
    // that is filled, then the second row and so on...
    int i = 0; // index into inLine array
    for ( int r = 0; r < room.length; r++ ){

        for (int c = 0; c < room[r].length; c++){
            if (i == inLine.length){
                // all students from the line are seated
                break; // break out of the immediate loop
            }
            room[r][c] = inLine[i] ;
            i++; // go into the next student in line

        }
    }
    // Students leave the classroom in single line
    // Fill up the line column-wise (first column (all rows),
    // second column, so on)
    for ( int c = 0; c < room[0].length; c++){
        for ( int r = 0; c < room.length; r++){
            if ( i == inLine.length){
                break;
            }
            if (room[r][c] == null ){
                //null means there is nothing in there
                // no student seating

            } else{

            
            inLine[i] = room[r][c];
            i++;
            }
        }
    }
    StdOut.println("Students are leaving column wise ");
    for (String stu : inLine) {
        StdOut.print(stu + " - ");
    }
}
}