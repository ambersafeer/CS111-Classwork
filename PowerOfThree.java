public class PowerOfThree {
   /*  public static void main (String[] args){
        int number = Integer.parseInt(args[0]);
        while (number != 0){
            if (number % 3 == 0){
                number = number / 3;
            } else{
                System.out.println(false);
            }
        } System.out.println("true");
    }*/


    public static boolean power (int number){
        if (number==0){
            return false;
        }
        while (number != 1){
            if (number % 3 == 0){
                number = number / 3;
            } else{
                return false;
            }
        } return true;
}

public static void main (String[] args){
    System.out.println(power(Integer.parseInt(args[0])));
}
}
