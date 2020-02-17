public class Restaurant {
    public static void main(String args[]){
    Meal meal1 = new Burger("Regular",true);
    meal1.order();
    Meal meal2 = new Pizza(8,"CheeseBurst");
    meal2.order();

    }
}
