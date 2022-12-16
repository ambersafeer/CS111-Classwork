public class Train {
    public static void main(String[] args){
int age = Integer.parseInt(args[0]);
double price = Double.parseDouble(args[1]);
if ( age < 0 | age > 120 ) {
    System.out.println("error");
}
if ( age < 6 ) {
    System.out.println( 0 );
} else {
    if ( age > 70 ) {
        price = 5.20;
    } else {
        price = 11.50;
}

System.out.println( price );

}


}
}
