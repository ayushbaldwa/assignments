public class NormalPhone extends Phone {
    @Override
    public void makeCall() {
        System.out.println("Calling from normal phone");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving on normal phone");
    }
}
