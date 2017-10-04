public class Main {
    public static void main (String[] args){
        //
        // CHALLENGE 1:
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
        System.out.println("--------------CHALLENGE 1--------");
        Account testAccount = new Account();
        testAccount.setNumber("100200001");
        testAccount.setBalance(100.00);
        testAccount.setCustName("Mohammad Alam");
        testAccount.setCustEmail("MA@test.com");
        testAccount.setCustPhone("1234567890");
        //printAccountDetails(testAccount);
        testAccount.depositFund(50.00);
        testAccount.withdrawFund(160.00);
        testAccount.withdrawFund(25);
        //printAccountDetails(testAccount);
        System.out.println("-------------CHALLENGE 2-------------");
        //
        // CHALLENGE 2:
        // 1. create a new class VipCustomer
        // 2. it should have 3 fields name, credit limit,
        //    and email address
        // 3. create 3 constructors
        //  a. 1st constructor empty should call the constructor with
        //     3 parameters with default values
        //  b. 2nd constructor should pass on the 2 values it receives
        //     and add a default and add a default value
        //  c. 3rd constructor should save all fields
        // 4. Create getters only for this using code generation of
        //     intellij as setters wont be needed
        // 5. Test and confirm it works
        VipCustomer testCustomer = new VipCustomer();
        System.out.println("Name: "+testCustomer.getName());
        System.out.println("Credit limit: "+testCustomer.getCreditLimit());
        System.out.println("Email: "+testCustomer.getEmailAddress());

        VipCustomer testCustomer1 = new VipCustomer("M Alam",5000.00);
        System.out.println("Name: "+testCustomer1.getName());
        System.out.println("Credit limit: "+testCustomer1.getCreditLimit());
        System.out.println("Email: "+testCustomer1.getEmailAddress());

        VipCustomer testCustomer2 = new VipCustomer("M Alam",5000.00,"malam@malam.com");
        System.out.println("Name: "+testCustomer2.getName());
        System.out.println("Credit limit: "+testCustomer2.getCreditLimit());
        System.out.println("Email: "+testCustomer2.getEmailAddress());
        System.out.println("---------END-------------");
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
