import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         //ATM pin that user has to introduce in order to be able to use the machine
        int atmPin = 123;

        AtmOperationsImplemented operation = new AtmOperationsImplemented();

        Scanner input = new Scanner(System.in);
        System.out.println("Hi and welcome to ATM machine!");
        System.out.print("Enter ATM pin: ");
        int atmGivenPin = input.nextInt();

        if(atmPin == atmGivenPin){
            while(true){
                System.out.println("1. View available balance");
                System.out.println("2. Withdraw amount");
                System.out.println("3. Deposit amount");
                System.out.println("4. View statement");
                System.out.println("5. Exit ");

                System.out.println("Enter your choice: ");
                int choice = input.nextInt();

                if(choice == 1){
                    operation.viewBalance();
                }
                else if(choice == 2){
                    System.out.println("Enter amount to withdraw (it has to be a multiple of 5): ");
                    double withdrawAmount = input.nextDouble();
                    operation.withdrawAmount(withdrawAmount);
                }
                else if(choice == 3){
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    operation.depositAmount(depositAmount);

                }
                else if(choice == 4){
                    operation.viewStatement();
                }
                else if(choice == 5){
                    System.out.println("Collect your card");
                    System.out.println("Thank your for using the ATM machine.");
                    System.exit(0);
                }
                else{
                    System.out.println("Enter a valid choice.");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM number or pin");
            System.exit(0);
        }
    }
}
