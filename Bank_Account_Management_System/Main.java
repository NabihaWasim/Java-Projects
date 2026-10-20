
package Bank_Account_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank_Account holder1 = new Bank_Account(450000.00, "Himesh Reshammiya");
        Bank_Account holder2 = new Bank_Account(990000.00, "Utsav Kumar");
        Bank_Account holder3 = new Bank_Account(670000.00, "Nabiha Wasim");

        while (true) {
            System.out.println("Enter the account number to perform operations.");
            System.out.println();
            System.out.println("1: Himesh Reshammiya");
            System.out.println("2: Utsav Kumar");
            System.out.println("3: Nabiha Wasim");
            System.out.println("4: Exit Program");
            System.out.println();

            int account = input.nextInt();

            if (account == 4) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            Bank_Account selected_account;

            switch (account) {
                case 1:
                    selected_account = holder1;
                    break;
                case 2:
                    selected_account = holder2;
                    break;
                case 3:
                    selected_account = holder3;
                    break;
                default:
                    System.out.println("Invalid Account.");
                    continue;
            }

            while (true) {
                System.out.println();
                System.out.println("Enter your choice:");
                System.out.println("1: Check Balance");
                System.out.println("2: Withdraw Money");
                System.out.println("3: Deposit Money");
                System.out.println("4: Change Account");
                System.out.println();

                int choice = input.nextInt();

                if (choice == 4) {
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.println("Check Balance");
                        selected_account.Check_Balance();
                        break;

                    case 2:
                        System.out.println("Enter the amount:");
                        double amount = input.nextDouble();
                        if(amount<0){
                            System.out.println("Invalid amount(negative value).");
                        }
                        else{
                            selected_account.Withdraw_Amount(amount);                            
                        }
                        break;
                        
                    case 3:
                        System.out.println("Enter the amount:");
                        amount = input.nextDouble();
                        if(amount<0){
                            System.out.println("Invalid amount(negative value).");
                        }
                        else{
                            selected_account.Deposit_Amount(amount);
                        }
                        break;
                        
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        }

        input.close();
    }
}
