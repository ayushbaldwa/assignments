public class Book
{
    private Driver driver;
    private Customer customer;
    Book(Driver driver,Customer customer)
    {
        this.driver = driver;
        this.customer = customer;
    }
    //getter and setters
    public String getDriverName()
    {
        return this.driver.getName();
    }
    public String getCustomerName()
    {
        return this.customer.getName();
    }
    public void bookRide(Trip trip)
    {
        if(driver.acceptOrReject(trip))
        {
            System.out.println("Your ride has been booked!");
            System.out.println("Starting point : " + trip.getSource());
            System.out.println("CustomerName point : " + trip.getDestination());
            System.out.println("Total Fare : " + trip.getFare());
        }
        else
        {
            System.out.println("Please re-book the ride!");
        }
    }
}
