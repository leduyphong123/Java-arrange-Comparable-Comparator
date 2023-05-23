package entity;

import java.lang.Comparable;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "name = " + this.name + " - age = " + this.age + " - address = " + this.address;
    }

    @Override
    public int compareTo(Student s) {
      return this.getName().compareTo(s.getName());
    }
}
