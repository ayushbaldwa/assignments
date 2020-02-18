public class Transaction {
    public static void main(String args[]){
  ATM atm=new ATM("ayush","123",23456,756890456);
  atm.checkBalance();
  atm.ValidatePin(23456);
  atm.WithDraw(2100);
  atm.checkBalance();

    }
}
