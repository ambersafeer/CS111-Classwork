// every program in java has to be inside a class
public class Pay {

    /*entry point of the program: interpreter looks for the main method and starts the
    execution of hte program right here */ 
    public static void main (String[]args) {

        // command line inputs come inside the programm through args
        //declare a variable of type double that stores real numbers
        double hoursWorked = Double.parseDouble(args[0]); 
        double wage = Double.parseDouble(args[1]);

        if ( hoursWorked < 0 || wage <= 0 ) {
            System.out.println("error");
        } else {
            double totalPay = hoursWorked * wage;
            System.out.println("Total pay is " + totalPay);
        }
        
    }
    
}
