public class BankAccount {
    //TODO: build a deposit money method

    //TODO: build a draw money method

    //TODO: build a balance method to show the actual balance in bank account

    //TODO: build user informations (Name, agency number, bank account number and bank balance)

    private String userName;
    private String agencyNumber;
    private String accountNumber;
    private double bankBalance;

    public BankAccount(){}

    public BankAccount(String userName, String agencyNumber, String accountNumber, double bankBalance){
        this.userName = userName;
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;

        System.out.println("Hello " + userName + ", thank you for creating an account in our bank. Your agency is " + agencyNumber + ", account number " + accountNumber + ", and your balance of R$" + bankBalance + " is available for withdrawal!");
    }
}
