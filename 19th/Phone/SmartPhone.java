public class SmartPhone extends Phone{

    @Override
    public void makeCall() {
        System.out.println("Calling from smart phone.");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving on smart phone.");
    }

    public void touchScreen(){
        System.out.println("Touch Screen");
    }
}
