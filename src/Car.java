public class Car extends MotorVehicle{
    public boolean isElectric = true;

    public void start() {
        super.running = true;
        System.out.println("This vehicle's color is: " + super.color + " " +
                "and the inherited boolean returns " + true);
        System.out.println("Is this vehicle electric? " + isElectric);
        System.out.println("This vehicle is a car");
        System.out.println("This vehicle is running\n");

    }
    public void stop() {
        super.running = false;
        System.out.println("This vehicle's color is: " + super.color + " " +
                "and the inherited boolean returns " + false);
        System.out.println("Is this vehicle electric? " + isElectric);
        System.out.println("This vehicle is a car");
        System.out.println("This vehicle is stopped\n");
    }
}
