package Inheritance;

public class CarTest {

    public static void main(String [] args){
        Car c= new Car();
        c.name="Honda";
        c.fuelCapacity=100;
        System.out.println(c.name);
        System.out.println(c.fuelCapacity);

        Car c1 = new Car("Nissan",120);
        System.out.println(c1.name);
        System.out.println(c1.fuelCapacity);
        c1.start();
        c1.refule();
        c1.refule(25);

        CarHonda h = new CarHonda();
        h.name="Accord";
        h.fuelCapacity=104;
        System.out.println(h.name);
        System.out.println(h.fuelCapacity);
        h.start();
        h.refule();
        h.gps();

    }
}
