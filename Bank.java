public class Bank {
    private double balance;
    private String name;

    public Bank(){
        balance = 0.0;
        name = "customer";


    }
    public Bank (double balance, String name){
        this.balance = balance;
        this.name = name;
    }

    public String toString() {
        String str = "Bank account holder is: " + name + ". Current balance is $" + balance;
        return str;
    }

    public void withdraw (double amountW){
        if (balance >= amountW){
        balance = balance - amountW;
        } else{
            return false;
        }

    }
    public void deposit (double amountD){
        balance = balance + amountD;
    }
    public void transfer(Bank one, Bank two, double amount){
        one.withdraw(amount);
        two.deposit(amount);
    }

    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName (String name){
        this.name = name;
    }


    public static void main (String[] args){
        StdOut.print("Enter the name of the account holder ");
        String name = StdIn.readString();
        StdOut.print("Enter the balance of the account ");
        int balance  = StdIn.readInt();
        Bank account1 = new Bank(balance, name);
        StdOut.println(account1.toString());
        StdOut.print("Enter the name of the second account holder ");
        String name2 = StdIn.readString();
        StdOut.print("Enter the balance of the second account ");
        int balance2  = StdIn.readInt();
        Bank account2 = new Bank(balance2, name2);
        StdOut.println(account2.toString());
        StdOut.println("Enter the amount you would like to ")
    }
}
