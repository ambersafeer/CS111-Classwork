import StdOut;

public class AveragePopulationAge {
    public static void main (String[] args){
        int sum = 0;
        int count = 0;

        while ( !StdIn.isEmpty() ){
            // there is something to read from Standard Input
            int age = StdIn.readInt();
            sum = sum + age;
            count += 1;

        }
        double avg = sum * 1.0 / count; 
        StdOut.println("Average " + avg);
        
    }
}
