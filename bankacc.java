import java.awt.*;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BlockingDeque;

public class bankacc {
    public static void main(String[] args) {
        Bank sunny = new Bank();
        sunny.showMenu();

    }
}

class Bank{
    double Balance;
    double USD;
    double EURO;
    double JPY;
    double RMB;
    String Username;
    String customerName;
    String customerID;

    void create_Account(String Username, String Password){

    }

    void deposit(int amount){
        Balance = Balance + amount;
    }

    void withdraw(int amount){
        Balance = Balance - amount;
    }


    //display a number of options that allows the user to interact with the banking application
    //option A: create account
    //option B: deposit money
    //option C: withdraw money
    //option D: check balance
    //option E: exit
    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Please enter an option from Create Account(A), Deposit(B), Withdraw(C), Check Balance(D), Exchange(E), Check Exchange Balance(F), Exit(G)");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'A':
                    Scanner scanAcc = new Scanner(System.in);
                    System.out.println("Create Account");
                    System.out.println("Please enter your username and password:");
                    String Username = scanner.next();
                    String Password = scanner.next();
                    create_Account(Username, Password);
                    System.out.println("Username: " + Username);
                    System.out.println("Password: " + Password);
                    break;

                case 'B':
                    Scanner scanDepo = new Scanner(System.in);
                    System.out.println("Deposit");
                    System.out.println("Please enter the amount:");
                    int depoAmount = scanner.nextInt();
                    deposit(depoAmount);
                    System.out.println("Balance: " + Balance);
                    System.out.println("Deposit amount: " + depoAmount);
                    break;

                //finish the rest of the cases

                case 'C':
                    Scanner scanWith = new Scanner(System.in);
                    System.out.println("Withdraw");
                    System.out.println("Please enter the amount:");
                    int withAmount = scanner.nextInt();
                    withdraw(withAmount);
                    System.out.println("Balance: " + Balance);
                    System.out.println("Withdraw amount: " + withAmount);
                    break;

                case 'D':
                    System.out.println("Check Balance");
                    System.out.println("Balance: " + Balance);
                    break;

                case 'E':
                    Scanner scanEx = new Scanner(System.in);
                    System.out.println("Exchange");
                    System.out.println("Enter the type of money for exchange: (USD, EURO, JPY, RMB)");
                    String moneyType = scanner.next();
                    System.out.println("Money Type: " + moneyType);
                    System.out.println("Enter the amount: (CAD)");
                    int exchangeAmount = scanner.nextInt();
                    switch(moneyType){
                        case "USD":
                            Balance = Balance - exchangeAmount;
                            USD = 0.8 * exchangeAmount;
                            System.out.println("USD: " + USD);
                            break;

                        case "EURO":
                            Balance = Balance - exchangeAmount;
                            EURO = 0.67 * exchangeAmount;
                            System.out.println("EURO: " + EURO);
                            break;

                        case "JPY":
                            Balance = Balance - exchangeAmount;
                            JPY = 86.86 * exchangeAmount;
                            System.out.println("JPY: " + JPY);

                        case "RMB":
                            Balance = Balance - exchangeAmount;
                            RMB = 5.22 * exchangeAmount;
                            System.out.println("RMB: " + RMB);
                    }

                    break;

                case 'F':
                    System.out.println("Check Exchange Balance");
                    System.out.println("USD: " + USD);
                    System.out.println("EURO: " + EURO);
                    System.out.println("JPY: " + JPY);
                    System.out.println("RMB: " + RMB);
                    break;
            }
            }while(option != 'G');
            System.out.println("Exit");
            System.out.println("have a nice day!");
            // end of showMenu()

    }
}