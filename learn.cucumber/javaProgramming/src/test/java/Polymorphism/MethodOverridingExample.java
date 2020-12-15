package Polymorphism;

import org.testng.annotations.Test;

public class MethodOverridingExample extends School{

    public void testStudent(int id){
        System.out.println("Hello I am number : " + id);
    }

    @Test
    public void testMethodOverriding(){
        School school = new School();
        school.testStudent(210);
        testStudent(2001);
    }
}
