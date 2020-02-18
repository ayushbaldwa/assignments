public class ATM extends ATMUser implements CheckAndWithdraw{
private double balance;

    ATM(String Name, String AccountNumber, int Pin, int MobileNumber) {
        super(Name, AccountNumber, Pin, MobileNumber);
    }

    @Override
    public void ValidatePin(int Pin) {
        if(Pin==getPin())
            System.out.println("Pin validtaed");
        else
            System.out.println("Wrong Pin entered");
    }

    double getBalance(){
        return balance;
    }
    public void setBalance(){
    this.balance=balance;
    }
    @Override
    public void checkBalance() {
        System.out.println("balance: "+ balance);
    }



    @Override
    public void WithDraw(double amount) {
    if(amount>balance)
        System.out.println("Not available.");
    else{
        System.out.println("Available.Please Collect cash");
        balance=balance-amount;
    }
    }
}
