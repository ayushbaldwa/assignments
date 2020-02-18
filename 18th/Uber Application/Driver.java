public class Driver extends User implements CalculateRating
{
    Driver(String name,double rating)
    {
        super(name,0);
        System.out.println("Welcome " + name);
    }
    public void calculateRating()
    {
        this.setRating(3.5);
    }
    public boolean acceptOrReject(Trip trip)
    {
        System.out.println("Pick Up location : " + trip.getSource());
        System.out.println("Drop location : " + trip.getDestination());
        return true;
    }
}