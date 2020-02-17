import java.util.*;
public class Hierarchy {
    public static void main(String[] args) {
        ArrayList<Rodent> list = new ArrayList<Rodent>();
        list.add(new Mouse(2));
        list.add(new Gerbil(3));
        list.add(new Hamster(4));
        for(Rodent rodent : list)
        {
            rodent.biting();
            rodent.noise();
        }
    }
}
