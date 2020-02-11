public abstract class Medicine
{
    public String name;
    public String brand;

    public Medicine(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Medicine() {
        name = null;
        brand = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract float getDiscount();
}

