import java.util.Scanner;

public class Bank {
    int previousTransaction;
    int balance;
    String customerName;
    int CustomerId;

public Bank(String name,int ID){
    customerName = name;
    CustomerId = ID;
}


    public void deposit( int amount){
    if (amount>0) {
        balance = amount + balance;
        previousTransaction = balance + amount;
    }
    }
    public void withdraw(int amount ){
    if (amount>0) {
        balance = balance - amount;
        previousTransaction = -amount;
    }
    }

    public void getPreviousTransaction(){
        if (previousTransaction >0){
            System.out.println("The amount deposited is = " + previousTransaction);
        }
        else if (previousTransaction<0){
            System.out.println("The amount withdrawn is = " +Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction");
        }
    }
    public void showMenu(){
    int option = 0;
        System.out.println("Welcome " + customerName);
        System.out.println("Your account number is :" +CustomerId);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter option");
        System.out.println();
        System.out.println("1.Check balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Previous Transaction");
        System.out.println("5.Exit");
        do {
            System.out.println("...............");
            System.out.println("Enter an option :");
             option = input.nextInt();
            System.out.println("\n");

            switch (option){
                case 1:
                    System.out.println("Balance =" + balance);
                    option = input.nextInt();
                    break;
                case 2:
                    System.out.println("Deposit amount = " );
                    int amount1 = input.nextInt();
                    System.out.println("The amount deposited is = " + amount1);
                    deposit(amount1);
                    break;
                case 3:
                    System.out.println("Withdraw amount =" );
                    int amount2 = input.nextInt();
                    System.out.println("Withdrawn = " + amount2);
                    withdraw(amount2);
                    break;
                case 4:
                    System.out.println();
                    getPreviousTransaction();
                case 5:
                    System.out.println("................");
                    break;
                default:
                    System.out.println("Invalid choice!Try again");

            }
        } while (option != 5);{
            System.out.println("Thank you for using our services!");

        }
    }
}
