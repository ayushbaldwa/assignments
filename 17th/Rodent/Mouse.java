public class Mouse extends Rodent{
    Mouse(int length)
    {
        super(length);
        System.out.println("In mouse constructor and has a tail length " + length);
    }
    @Override
    public void noise() {
        System.out.println("Mouse is making noise");
    }
    @Override
    public void biting()
    {
        System.out.println("Mouse is biting");
    }
}