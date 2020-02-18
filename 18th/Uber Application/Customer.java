public class Customer extends User implements CalculateRating
{
    Customer(String name,double rating)
    {
        super(name,0);
        System.out.println("Welcome " + name);
    }
    public void calculateRating()
    {
        this.setRating(3.5);
    }
}
