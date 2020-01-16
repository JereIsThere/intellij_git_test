package polymorphism;

import jdk.swing.interop.SwingInterOpUtils;

import javax.print.attribute.standard.MediaSize;

public class PolymorphismMain {

    public static void main(String[] args) {
        Car randomCar;
        switch ((int)(Math.random()*3)+1){
            case 1:
                randomCar = new YeetCar();
                System.out.println("1 " +"\n");
                break;
            case 2:
                randomCar = new YoinkCar();
                System.out.println("2\n");
                break;
            case 3:
                randomCar = new OtherCar();
                System.out.println("3\n");
                break;
            default:
                System.out.println("other or summ\n");
                randomCar = new Car("weird car", 88);
        }

        randomCar.accerlerate();
        randomCar.brake();
        randomCar.getCylinders();
        randomCar.getName();
        randomCar.startEngine();

    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("starting generic engine");
    }

    public void accerlerate() {
        System.out.println("accelerating generically");
    }

    public void brake() {
        System.out.println("braking generically");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class YeetCar extends Car {

    public YeetCar() {
        super("yeetcar", 69);
    }

    @Override
    public void startEngine() {
        System.out.println("starting yeet engine");
    }

    @Override
    public void accerlerate() {
        System.out.println("accerlerating at fast speeds");
    }

    @Override
    public void brake() {
        System.out.println("teey");
    }
}

class YoinkCar extends Car{

    public YoinkCar() {
        super("yoinkcar", 0);
    }

    @Override
    public void startEngine() {
        System.out.println("yoink start engine");
    }

    @Override
    public void accerlerate() {
        System.out.println("accelerating in the wrong direction");
    }

    @Override
    public void brake() {
        System.out.println("braking very rapidly");
    }
}

class OtherCar extends Car{

    public OtherCar() {
        super("other car", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("starting 3rd party engine");
    }

    @Override
    public void accerlerate() {
        System.out.println("tries to accerlerate");
    }

    @Override
    public void brake() {
        System.out.println("brakes don't work");
    }
}