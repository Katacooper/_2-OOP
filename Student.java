package javaoop.exercises._2;

public class Student {
    String name = null;
    int age = 0;
    public Student(String name, int age)
    {
        System.out.println("Constructing...");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }

    public Student(String name)
    {
        this.name = name;
        System.out.println("Constructor 1");
    }

    public Student(int age) {
        this.age = age;
        System.out.println("Constructor 2");
    }

    public Student()
    {
        System.out.println("Constructor 3");
    }
}
