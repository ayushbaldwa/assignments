import java.util.*;
public class Computer
{
    private boolean isMouse;
    private boolean isKeyBoard;
    private boolean isCPU;
    //constructor
    public Computer()
    {
        isMouse = false;
        isKeyBoard = false;
        isCPU = false;
    }
    //getters and setters
    public void setisMouse(boolean isM)
    {
        isMouse = isM;
    }
    public void setisKeyBoard(boolean isK)
    {
        isKeyBoard = isK;
    }
    public void setisCPU(boolean isC)
    {
        isCPU = isC;
    }
    public boolean getisMouse()
    {
        return isMouse;
    }
    public boolean getisKeyBoard()
    {
        return isKeyBoard;
    }
    public boolean getisCPU()
    {
        return isCPU;
    }
    //methods
    public void connect(Mouse mouse)
    {
        System.out.println("Mouse connected successfully!");
        isMouse = true;
    }
    public void connect(Keyboard keyboard)
    {
        System.out.println("Keyboard connected successfully!");
        isKeyBoard = true;
    }
    public void connect(Cpu cpu)
    {
        System.out.println("CPU connected successfully!");
        isCPU = true;
    }
}