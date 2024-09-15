import java.util.Scanner;

public class UserAccount {
    public static void main(String[] args) throws Exception {
        //TODO: user inputs to build bank account (name, agency number, bank account number and bank balance)
        String userName;
        String agencyNumber;
        String accountNumber;
        double bankBalance;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! Welcome to our bank account creation system! Would you like to create a new bank account?");
        String yesOrNo = scanner.nextLine();

        if(yesOrNo.equals("Yes")){
            System.out.println("Please enter your full name: ");
            userName = scanner.nextLine();

            System.out.println("Please enter the agency number: ");
            agencyNumber = scanner.nextLine();

            System.out.println("Please enter the account number: ");
            accountNumber = scanner.nextLine();

            System.out.println("Please enter the bank balance: ");
            bankBalance = scanner.nextDouble();

            BankAccount newAccount = new BankAccount(userName, agencyNumber, accountNumber, bankBalance);
            
        } else if(yesOrNo.equals("No")){
            System.out.println("Okay! Thanks for getting in touch with us. See you!");
        }

        scanner.close();
    }
}
