package Task3;

public class Main {
    public static void main(String[] args) {
        Bikes bikes = new Bikes();
        bikes.setName("Pedal Bikes");
        bikes.setWithEngine("no engine");
        bikes.setWheel_count(2);
        bikes.identify_myself();

        Bikes bikes2 = new Bikes("Motor Bikes", "with engine", 2);
        bikes2.identify_myself();

        Cars cars = new Cars();
        cars.setName("Sport Cars");
        cars.setWheel_count(4);
        cars.setWithEngine("with engine");
        cars.setEngine_type("V");
        cars.identify_myself();

        Cars cars2 = new Cars("Pickup cars", "with engine", 4, "Solar");
        cars2.identify_myself();

        Buses buses = new Buses();
        buses.setName("Trans Jakarta");
        buses.setWithEngine("with engine");
        buses.setWheel_count(4);
        buses.setPrivateBus("Public Bus");
        buses.identify_myself();

        Buses buses2 = new Buses("School Bus", "with engine", 4, "Private Bus");
        buses2.identify_myself();
    }
}
