public class Burger extends Meal{
String burgerSize;
boolean withChips;

    //constructor
 Burger(String burgerSize,boolean withChips){
    this.burgerSize=burgerSize;
    this.withChips=withChips;
}
//getters and setters
String getBurgerSize(){
    return burgerSize;
}
void setBurgerSize(){
    this.burgerSize=burgerSize;
}
boolean getWithChips(){
    return withChips;
}
void setWithChips(){
    this.withChips=withChips;
}
public void order(){
     System.out.println("Your "+burgerSize+" burger is ready");
}
}
