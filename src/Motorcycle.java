public class Motorcycle extends MotorVehicle{
    public String tireColor;

    public Motorcycle(String color, String tireColor) {
        super(color);
        this.tireColor = tireColor;
    }

    public void start() {
        this.running = true;

        System.out.println("This vehicle's color is: " + this.color + " " +
                "and the inherited boolean returns " + true);
        System.out.println("This vehicle's tire color is: " + tireColor);
        System.out.println("This vehicle is a motorcycle");
        System.out.println("This vehicle is running\n");

    }
    public void stop() {
        this.running = false;
        System.out.println("This vehicle's color is: " + this.color + " " +
                "and the inherited boolean returns " + false);
        System.out.println("This vehicle's tire color is: " + tireColor);
        System.out.println("This vehicle is a motorcycle");
        System.out.println("This vehicle is stopped\n");
    }
}


