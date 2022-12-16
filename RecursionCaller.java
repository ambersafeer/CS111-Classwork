public class RecursionCaller {
    public static void main (String[]args){
       // int result = Recursion.rNumberOfDigits(3471);
      //  StdOut.println(result);

        //Recursion.rConvert(8);

        int[] array = {7, 1, 2, 7, 3, 4};
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int sumResult = Recursion.findSum(array, firstIndex, lastIndex);
        StdOut.print("Array sum is " + sumResult);
    }
}
