public class RecursiveFactorial {
 public static int factorial (int n){
    if (n == 0){
        return 1;
    }
     return n * factorial (n-1);

 }
    public static void main (String[] args){
        int fact = factorial(3);
        StdOut.print(fact);
    }   
}
