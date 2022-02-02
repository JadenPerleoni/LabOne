import java.util.Scanner;

public class VehicleManager {
    static Car[] carArray = new Car[3];
    static Motorcycle[] motorCycleArray = new Motorcycle[3];


    public static void run() {
        Motorcycle firstMotorCycle = new Motorcycle();
        Motorcycle secondMotorCycle = new Motorcycle();
        Motorcycle thirdMotorCycle = new Motorcycle();
        Scanner scnr = new Scanner(System.in);
        int userChoice;

        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car();

        firstMotorCycle.running = false;
        secondMotorCycle.running = false;
        thirdMotorCycle.running = false;

        firstCar.running = false;
        secondCar.running = false;
        thirdCar.running = false;

        firstCar.color = "red";
        firstCar.isElectric = true;

        secondCar.color = "blue";
        secondCar.isElectric = false;

        thirdCar.color = "yellow";
        thirdCar.isElectric = true;

        firstMotorCycle.color = "green";
        firstMotorCycle.tireColor = "gold";

        secondMotorCycle.color = "orange";
        secondMotorCycle.tireColor = "red";

        thirdMotorCycle.color = "purple";
        thirdMotorCycle.tireColor = "green";

        carArray[0] = firstCar;
        carArray[1] = secondCar;
        carArray[2] = thirdCar;

        motorCycleArray[0] = firstMotorCycle;
        motorCycleArray[1] = secondMotorCycle;
        motorCycleArray[2] = thirdMotorCycle;

        System.out.print("Would you like to start car one, two, or three? Enter 1,2, or 3. ");
        userChoice = scnr.nextInt();
        if (userChoice == 1) {
            carArray[0].start();
        } else if (userChoice == 2) {
            carArray[1].start();
        } else if (userChoice == 3) {
            carArray[2].start();
        } else {
            System.out.println("Error in your entry");
        }

        System.out.print("Would you like to start motorcycle one, two, or three? Enter 1,2, or 3. ");
        userChoice = scnr.nextInt();
        if (userChoice == 1) {
            motorCycleArray[0].start();
        } else if (userChoice == 2) {
            motorCycleArray[1].start();
        } else if (userChoice == 3) {
            motorCycleArray[2].start();
        } else {
            System.out.println("Error in your entry");
        }

        System.out.print("Would you like to stop car one, two, or three? Enter 1,2, or 3. ");
        userChoice = scnr.nextInt();
        if (userChoice == 1) {
            carArray[0].stop();
        } else if (userChoice == 2) {
            carArray[1].stop();
        } else if (userChoice == 3) {
            carArray[2].stop();
        } else {
            System.out.println("Error in your entry");
        }

        System.out.print("Would you like to stop motorcycle one, two, or three? Enter 1,2, or 3. ");
        userChoice = scnr.nextInt();
        if (userChoice == 1) {
            motorCycleArray[0].stop();
        } else if (userChoice == 2) {
            motorCycleArray[1].stop();
        } else if (userChoice == 3) {
            motorCycleArray[2].stop();
        } else {
            System.out.println("Error in your entry");
        }

        System.out.println("Is car one running? " + carArray[0].running);
        System.out.println("Is car two running? " + carArray[1].running);
        System.out.println("Is car three running? " + carArray[2].running);

        System.out.println("Is motorcycle one running? " + motorCycleArray[0].running);
        System.out.println("Is motorcycle two running? " + motorCycleArray[1].running);
        System.out.println("Is motorcycle three running? " + motorCycleArray[2].running);


    }
}
