public class AverageMovieRatingsForLoop {

        public static void main(String[] args) {
    
            // args stores command line arguments
            // args.length stores the number of arguments in the comand line 
            
            int nbrFriends = args.length; //nbr of people that went to the movies
            int sum = 0;
    
            for (int i = 0; i < nbrFriends; i +=1){
                // rating is only visible inside of the while loop
                int rating = Integer.parseInt(args[i]);
                sum = sum + rating; // sum += rating;
    
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
    
