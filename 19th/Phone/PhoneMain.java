public class PhoneMain {
    public static void main(String args[]){
        Phone phone=new NormalPhone();
        phone.makeCall();
        phone.receiveCall();
        phone=new SmartPhone();
        phone.makeCall();
        phone.receiveCall();
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.touchScreen();

    }
}
