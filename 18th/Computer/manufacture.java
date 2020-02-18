import java.util.*;
public class manufacture
{
    public static void main(String args[])
    {
       
        Computer c = new Computer();
        Mouse m = new Mouse();
        m.setmouseLength(1.0);
        m.setmouseBreadth(1.0);
        m.mouseDesign();
        Keyboard k = new Keyboard();
        k.setkeyboardLength(1.0);
        k.setkeyboardBreadth(1.0);
        k.keyboardDesign();
        Cpu cp = new Cpu();
        cp.setcpuLength(1.0);
        cp.setcpuBreadth(1.0);
        cp.cpuDesign();
        c.connect(m);
        c.connect(k);
        c.connect(cp);
        m.send(cp);
        k.send(cp);
        cp.receive(m);
        cp.receive(k);
        cp.send(c);
    }
}
