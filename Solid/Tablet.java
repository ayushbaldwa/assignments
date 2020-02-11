public class Tablet extends Medicine {
   // private String name;
    //private String brand;

    public Tablet(String name, String brand) {
        super();
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getDiscount() {
        float discount = 30;
        return discount;
    }
}
