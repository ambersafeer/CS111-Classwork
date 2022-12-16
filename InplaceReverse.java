public class InplaceReverse {
    public static void main(String[] args){
        int [] x = new int[args.length];
            for ( int i = 0; i < x.length; i++){
                x[i] = Integer.parseInt(args[i]);
            }
            int start = 0;
            int end = args.length - 1;
            while (start <= end){
                int temp = x[start];
                x[start] = x[end];
                x[end] = temp;
                start++;
                end--;
            }
            for(int i = 0; i < x.length; i++){
                System.out.print(x[i] + ", ");
            }
            
        }
    }


