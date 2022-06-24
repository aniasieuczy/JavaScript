class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int numberOfCylinders, String name) {
        this.cylinders = numberOfCylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getNumberOfCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine () {
        return "Car -> startEngine()";
    }

    public String accelerate () {
        return "Car -> accelerate()";
    }

    public String brake () {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}



 class Holden extends Car {

    public Holden(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ford extends Car {

    public Ford(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Holden mitsubishi = new Holden(6, "Outlander VRW 4 WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford ( 6, "Main.Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden ( 6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


    }
}

