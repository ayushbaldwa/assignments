public class ATMUser {
    private String Name;
    private String AccountNumber;
    private int Pin;
    private int MobileNumber;
    ATMUser(String Name,String AccountNumber,int Pin,int MobileNumber){
        this.Name=Name;
        this.AccountNumber=AccountNumber;
        this.Pin=Pin;
        this.MobileNumber=MobileNumber;
    }
    String getName(){
       return this.Name;
    }
    void setName(){
        this.Name=Name;
    }
    String getAccountNumber(){
        return this.AccountNumber=AccountNumber;
    }
    void setAccountNumber(){
        this.AccountNumber=AccountNumber;
    }
    int getPin(){
        return this.Pin;
    }
    void setPin(){
        this.Pin=Pin;
    }
    int getMobileNumber(){
        return this.MobileNumber;

    }
    void setMobileNumber(){
        this.MobileNumber=MobileNumber;
    }

}
