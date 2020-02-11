public class Syrup extends Medicine{
   // @Override
    //private String name;
    //private String brand;

    public Syrup( String name1, String brand1) {
        super();
        this.name = name1;
        this.brand = brand1;
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

    public float getDiscount(){
        float discount=10;
        return discount;
    }
}
