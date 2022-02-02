public class Motorcycle extends MotorVehicle{
    public String tireColor;

    public void start() {
        super.running = true;

        System.out.println("This vehicle's color is: " + super.color + " " +
                "and the inherited boolean returns " + true);
        System.out.println("This vehicle's tire color is: " + tireColor);
        System.out.println("This vehicle is a motorcycle");
        System.out.println("This vehicle is running\n");

    }
    public void stop() {
        super.running = false;
        System.out.println("This vehicle's color is: " + super.color + " " +
                "and the inherited boolean returns " + false);
        System.out.println("This vehicle's tire color is: " + tireColor);
        System.out.println("This vehicle is a motorcycle");
        System.out.println("This vehicle is stopped\n");
    }
}


