import java.util.*;
interface twoWayCommunication
{
    public void send(Computer computer);
    public void receive(Mouse mouse);
    public void receive(Keyboard keyboard);
}
public class Cpu implements twoWayCommunication
{
    private double cpuLength;
    private double cpuBreadth;

    public Cpu()
    {
        cpuLength = 0;
        cpuBreadth = 0;
    }
    //getters and setters
    public double getcpuLength()
    {
        return cpuLength;
    }
    public double getcpuBreadth()
    {
        return cpuBreadth;
    }
    public void setcpuLength(double cpuLength)
    {
        this.cpuLength = cpuLength;
    }
    public void setcpuBreadth(double cpuBreadth)
    {
        this.cpuBreadth = cpuBreadth;
    }

    //method
    public void cpuDesign()
    {
        System.out.println("cpu is created");
        System.out.println("cpu length : " + cpuLength);
        System.out.println("cpu breadth : " + cpuBreadth);
    }
    public void send(Computer computer)
    {
        System.out.println("Data is sent to computer");
    }
    public void receive(Mouse mouse)
    {
        System.out.println("Data received from mouse");
    }
    public void receive(Keyboard keyboard)
    {
        System.out.println("Data received from keyboard");
    }
}