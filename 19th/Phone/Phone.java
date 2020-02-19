public abstract class Phone {
    private double length;
    private double breadth;
    private String brand;
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand=brand;
    }

    public abstract void makeCall();
    public abstract void receiveCall();
}
