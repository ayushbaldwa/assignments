import java.util.*;
public class Keyboard implements communication
{
    private double keyboardLength;
    private double keyboardBreadth;

    public Keyboard()
    {
        keyboardLength = 0;
        keyboardBreadth = 0;
    }
    //getters and setters
    public double getkeyboardLength()
    {
        return keyboardLength;
    }
    public double getkeyboardBreadth()
    {
        return keyboardBreadth;
    }
    public void setkeyboardLength(double keyboardLength)
    {
        this.keyboardLength = keyboardLength;
    }
    public void setkeyboardBreadth(double keyboardBreadth)
    {
        this.keyboardBreadth = keyboardBreadth;
    }

    //method
    public void keyboardDesign()
    {
        System.out.println("keyboard is created");
        System.out.println("keyboard length : " + keyboardLength);
        System.out.println("keyboard breadth : " + keyboardBreadth);
    }

    public void send(Cpu cpu)
    {
        System.out.println("Data is sent to cpu");
    }
}