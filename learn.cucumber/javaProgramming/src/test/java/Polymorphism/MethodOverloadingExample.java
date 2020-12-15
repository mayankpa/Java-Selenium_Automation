package Polymorphism;

import org.testng.annotations.Test;

public class MethodOverloadingExample extends School{

    @Test
    public void testMethodOverloading(){
        School school = new School();
        school.testStudent(100,"Test");
        System.out.println("Test Git diff command");
    }

}
