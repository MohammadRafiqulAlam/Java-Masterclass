public class Main {

    //
    // Create a class for bank account
    // Create fields for the account name, balance,
    // customer name, email and phone number
    // create getter and stters for each field
    // create two additional methods:
    //  1. To allow the customer to deposit funds (increment the balance field)
    //  2. To allow the customer to withdraw funds (this should deduct from the balance field)
    // but not allow the withdrawal to complete if there is
    // insufficient funds.
    // Add System.out.println in the two methods above
    //
    public static void main (String[] args){
        Account testAccount = new Account();
        testAccount.setNumber("100200001");
        testAccount.setBalance(100.00);
        testAccount.setCustName("Mohammad Alam");
        testAccount.setCustEmail("MA@test.com");
        testAccount.setCustPhone("1234567890");
        printAccountDetails(testAccount);
        testAccount.depositFund(50.00);
        testAccount.withdrawFund(160.00);
        testAccount.withdrawFund(25);
        printAccountDetails(testAccount);
    }

    public static void printAccountDetails(Account a){
        System.out.println("*********************");
        System.out.println("Account details of "+ a.getCustName());
        System.out.println("Account number: "+ a.getNumber());
        System.out.println("Account balance: "+ a.getBalance());
        System.out.println("Email: "+ a.getCustEmail());
        System.out.println("Phone number: "+ a.getCustPhone());
        System.out.println("*********************");
    }
}
