public class Vehicle {

    private String name;
    private String size;
    private String fuelType;
    private int doors;
    private int gearbox;

    public Vehicle(String fuelType, int doors, int gearbox) {
        this.fuelType = fuelType;
        this.doors = doors;
        this.gearbox = gearbox;
    }

    public void move () {
        System.out.println("The car is moving");
    }

    public void changeGears (int gearbox) {
        System.out.println("The car is changing gears");
    }

    public void tankCar (String fuelType, int amount) {
    }


    public void increaseSpeed (int speed) {
        System.out.println("The car is increasing speed");
    }

    public void decreseSpeed (int speed){
        System.out.println("The car is slowing down");
    }

}

