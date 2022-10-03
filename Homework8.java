import java.util.Scanner;


public class Homework8 {

    public static void main(String[] args) {

//        - Finish up the logic that calculates the balance
//        - Create a method that withdraws from the balance
//        - Check that if a bank customer deposits $500, $150 and $35 and then withdraws $40 and $120 the balance is correct
//        - Print out a meaningful message if it is correct and if it is not

        BankingAccount myAccount = new BankingAccount();
        myAccount.deposit(500);
        myAccount.deposit(150);
        myAccount.deposit(35);

        System.out.println("Todays deposit total is : " + myAccount.balance);

        myAccount.withdraw(40);
        myAccount.withdraw(120);

        System.out.println("Your account total at WC Bank is :  " + myAccount.balance + " USD  Please come back again soon to take us up on the offer of 0.0000001% interest on your checking and savings account");


    }
}

class BankingAccount {

    public int balance;

    public void deposit(int sum) {
       balance = balance + sum;
        // do what?

    }
    public void withdraw(int withdraw){
        balance = balance - withdraw;

    }
    // what about withdrawal?
}