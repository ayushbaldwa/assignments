public class Pizza extends Meal{
    int pizzaSizeInInches;
    String baseType;

    //constructor
    Pizza(int pizzaSizeInInches,String baseType){
        this.pizzaSizeInInches=pizzaSizeInInches;
        this.baseType=baseType;
    }

    //getters and setters
    int getPizzaSizeInInches(){
        return pizzaSizeInInches;
    }
    void setPizzaSizeInInches(){
        this.pizzaSizeInInches=pizzaSizeInInches;
    }
    String getBaseType(){
        return baseType;
    }
    void setBaseType(){
        this.baseType=baseType;
    }
    public void order(){
        System.out.println("Your "+pizzaSizeInInches+" with "+baseType+" is ready");
    }
}
