public class User
{
    private String name;
    private double rating;
    //getters and setters
    User(String name,double rating)
    {
        this.name = name;
        this.rating = rating;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public String getName()
    {
        return this.name;
    }
    public double getRating()
    {
        return this.rating;
    }
}
