public class Hamster extends Rodent{

    Hamster(int length) {
        super(length);
        System.out.println("In Hamster constructor and has a tail length " + length);
    }

    @Override
    public void noise() {
        System.out.println("Hamster is making noise");

    }
    @Override
    public void biting()
    {
        System.out.println("Hamster is biting");
    }
}
