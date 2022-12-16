public class ArrayConcatenation {
    public static void main (String[] args){
        int[] arrayA = new int[3];
        int[] arrayB = new int[3];
        int j = 0;
        for(int i = 0; i < args.length; i++){
             if (i < 3){
                arrayA[i] = Integer.parseInt(args[i]);
             } else{
                arrayB[j] = Integer.parseInt(args[i]);
                j++;
             }
            }
        
        int[] newArray = new int[arrayA.length + arrayB.length];
        int current = 0;
        for (int i = 0; i < arrayA.length; i++){
            newArray[current] = arrayA[i];
            current++;
        }
        for (int i = 0; i < arrayB.length; i++){
            newArray[current] = arrayB[i];
            current++;
            }
        for(int i = 0; i < newArray.length - 1; i++){
                System.out.print(newArray[i] + ", ");
            
            }
            System.out.print(newArray[5]);
            
}
}
    
    
