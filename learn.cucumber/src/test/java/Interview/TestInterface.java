package Interview;

public class TestInterface implements TestOne {
    public static void main (String [] args){
        name();
        age();
    }


    public static void name() {
        System.out.println("Mayank");
    }


    public static void age() {
        System.out.println("32");
    }
}
