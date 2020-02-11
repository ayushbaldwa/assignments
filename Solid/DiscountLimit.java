public class DiscountLimit {
    public static void main(String args[]) {
        Medicine medicine = new Syrup("Name", "Brand1");
        Discount discount = new Discount();
        System.out.println(discount.getDiscount(medicine));
    }
}
