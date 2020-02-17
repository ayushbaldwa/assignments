public class Bike implements Vehicle{

    @Override
    public String VehicleType() {
        return "bike";
    }

    @Override
    public int NumberOfWheels() {
        return 2;
    }

    @Override
    public int NumberOfSeats() {
        return 2;
    }
}
