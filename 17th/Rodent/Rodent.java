public abstract class Rodent {
    private int tailLength;

    Rodent(int length)
    {
        System.out.println("In Rodent constructor and has a tail length " + length);
        this.tailLength = length;
    }
    public int getTailLength()
    {
        return this.tailLength;
    }
    public void setTailLength(int length)
    {
        this.tailLength = length;
    }

    public void biting()
    {
        System.out.println("Rodent is biting");
    }
    public abstract void noise();


}