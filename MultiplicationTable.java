public class MultiplicationTable {
    public static int printTable (int number){
        for (int i = 1; i <= number; i++){
            for (int j=0; j < number; j++){
                System.out.print(i*j + "\t");
            }
        }
        System.out.println();
    }

    public static void main (String[] args){
        printTable(Integer.parseInt(args[0]));
    }
    }
