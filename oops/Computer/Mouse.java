import java.util.*;
interface communication
{
    public void send(Cpu cpu);
}
public class Mouse implements communication
{
    private double mouseLength;
    private double mouseBreadth;

    Mouse()
    {
        mouseLength = 0;
        mouseBreadth = 0;
    }
    //getters and setters
    public double getmouseLength()
    {
        return mouseLength;
    }
    public double getmouseBreadth()
    {
        return mouseBreadth;
    }
    public void setmouseLength(double mouseLength)
    {
        this.mouseLength = mouseLength;
    }
    public void setmouseBreadth(double mouseBreadth)
    {
        this.mouseBreadth = mouseBreadth;
    }

    //method
    public void mouseDesign()
    {
        System.out.println("Mouse is created");
        System.out.println("Mouse length : " + mouseLength);
        System.out.println("Mouse breadth : " + mouseBreadth);
    }

    public void send(Cpu cpu)
    {
        System.out.println("Data is sent to cpu");
    }
}