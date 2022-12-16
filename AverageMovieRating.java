public class AverageMovieRating {

    public static void main(String[] args) {

        // args stores command line arguments
        // args.length stores the number of arguments in the comand line 
        
        int nbrFriends = args.length; //nbr of people that went to the movies
        int sum = 0;
        int i = 0; // this is the index on args

        while ( i < nbrFriends ) {
            // rating is only visible inside of the while loop
            int rating = Integer.parseInt(args[i]);
            sum = sum + rating; // sum += rating;
            i = i + 1; // i++ or i+=1;

        }

        // an integer divided by an integer results in an integer
        // make the numerator a double by multiplying it by 1.0
        double avg = sum * 1.0 / nbrFriends;

        // cast the numerator as a double and then divide
        double avg2 = ((double)sum)/nbrFriends;

        System.out.println("The movie's ratings average is " + avg);
        
        System.out.println("The movie's ratings average is " + avg2);
    }
   


}
