public class Design {
    public static void main(String args[]) {
        Vehicle v=new Bike();
        Vehicle v1=new Car();
      System.out.println("Number of seats in "+v.VehicleType()+" are "+v.NumberOfSeats());
      System.out.println("Number of wheels for a "+v.VehicleType()+" are "+v.NumberOfWheels());
     // System.out.println(v.VehicleType());
        System.out.println("Number of seats in "+v1.VehicleType()+" are "+v1.NumberOfSeats());
        System.out.println("Number of wheels for a "+v1.VehicleType()+" are "+v1.NumberOfWheels());
        System.out.println("Number of doors for a "+v1.VehicleType()+" are "+((Car) v1).NumberOfDoors());
     // System.out.println(v1.VehicleType());
      

    }
}