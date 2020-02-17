public class Car implements Vehicle {

    @Override
    public String VehicleType() {
        return "car";
    }

    @Override
    public int NumberOfWheels() {
        return 4;
    }

    @Override
    public int NumberOfSeats() {
        return 4;
    }

    public int NumberOfDoors(){
        return 4;
    }
}
