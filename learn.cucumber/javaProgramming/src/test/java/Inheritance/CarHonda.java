package Inheritance;

public class CarHonda extends Car {

    public CarHonda(){
        System.out.println("I am Honda Car Default Constructor");
    }

    @Override
    public void refule(){
        fuelCapacity= fuelCapacity+11;
        System.out.println(fuelCapacity);
    }
    public void gps(){
        System.out.println("Honda with GPS System");
    }

}
