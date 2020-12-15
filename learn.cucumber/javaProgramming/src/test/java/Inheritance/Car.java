package Inheritance;

public class Car {
    // global variable
    String name ;
    int fuelCapacity;

    public Car(){
        System.out.println("I am default constructor");
    }

    public Car(String name, int fuelCapacity){
        this.name = name;
        this.fuelCapacity= fuelCapacity;
    }

    public void start(){
        System.out.println("Car Starting : "+ name);
    }
    public void refule(){
        fuelCapacity= fuelCapacity+20;
        System.out.println(fuelCapacity);
    }

    public void refule(int qty){
        fuelCapacity = fuelCapacity+qty;
        System.out.println(fuelCapacity);
    }
}
