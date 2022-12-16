public class Grades {
    public static void main (String[] args){

        int students = Integer.parseInt(args[0]);
        int assignments = Integer.parseInt(args[1]);

        // create a 2D array
        // students is rows
        // assignments is columns

        double [][] scores = new double [students][assignments];

        // traverse the rows
        for ( int r = 0; r < scores.length; r++ ){

            // traverse the column for row r
            for ( int c = 0; c < scores[r].length; c++ ) {
                // store the score for student r, assignment c
                scores[r][c] = Math.random() * 10;


            }
        }

        // print all scores
        for ( int r = 0; r < scores.length; r ++){

            // prints all the scores for student r
            for (int c = 0; c < scores[r].length; c++){

                System.out.printf("%.1f ", scores[r][c]);
            }
            System.out.println();
        }

        int assignment = 2;
        double sum = 0;
        // loop over the rows
        for ( int s = 0; s < scores.length; s++){
            sum+= scores[s][assignment];

            }
            System.out.println("Average of assignment " + assignment + sum/scores.length);
        }
    }

