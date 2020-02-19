/*
Code having Cup as base class and a type of cup can be a mug , this designs a mug according to the user i.e.,
if he wants it with a handle or not and how much quantity does he want
 */
public class Cup {
 private double quantity;
 private boolean hasHandle;
Cup(double quantity,boolean hasHandle){
    this.quantity=quantity;
    this.hasHandle=hasHandle;
}
void setQuantity(double quantity){
    this.quantity=quantity;
}
double getQuantity(){
    return quantity;
}
void setHasHandle(boolean hasHandle){
    this.hasHandle=hasHandle;
}
boolean getHasHandle(){
    return hasHandle;
}
public void create(){
    System.out.println("Cup is created");
}
}
