public class Mug extends Cup {
    private double quantity;
    private boolean hasHandle;
    Mug(double quantity,boolean hasHandle) {
        super(quantity, hasHandle);

    }

    public void create(){
        if(hasHandle)
        System.out.println("A mug with quantity " +getQuantity()+" ml is created and has a handle");
        else
            System.out.println("A mug with quantity " +getQuantity()+" ml is created and has no handle");
    }



}
