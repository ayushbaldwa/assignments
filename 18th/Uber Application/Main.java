public class Main
{
    public static void main(String args[])
    {
        User customer = new Customer("Ravi" , 0);
        User driver = new Driver("Ramesh", 0);
        Trip trip = new Trip("Kachiguda","Zemoso Technologies");
        Book book = new Book((Driver)(driver),(Customer)(customer));
        book.bookRide(trip);
    }
}