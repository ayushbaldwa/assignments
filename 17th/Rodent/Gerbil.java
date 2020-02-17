public class Gerbil extends Rodent{
    Gerbil(int length) {
        super(length);
        System.out.println("In Gerbil constructor and has a tail length " + length);
    }

    @Override
    public void noise() {
        System.out.println("Gerbil is making noise");
    }
    @Override
    public void biting()
    {
        System.out.println("Gerbil is eating");
    }
}
