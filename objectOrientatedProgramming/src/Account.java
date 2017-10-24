public class Account {
    // fields
    private String number;
    private double balance;
    private String custName;
    private String custEmail;
    private String custPhone;
    // deposit function
    public void depositFund (double fund){
        this.balance += fund;
        System.out.println("Current balance is: "+this.balance);
    }
    // withdraw function
    public void withdrawFund (double amount){
        if (this.balance < amount){
            System.out.println("Withdraw amount cannot be greater than current balance: "+this.balance);
        } else {
            this.balance -= amount;
            System.out.println("You have withdrawn:" + amount);
            System.out.println("Your current balance is: "+this.balance);
        }
    }
    // getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
