package Polymorphism;

public class School {
    public School(){
        System.out.println("I am Default School constructor");
    }
    public void testStudent(int id){
        System.out.println(id);
    }
    private void testSudent(int id){
        System.out.println(id);
    }
    public void testStudent(int id, String name){
        System.out.println(id);
        System.out.println(name);
    }
}
