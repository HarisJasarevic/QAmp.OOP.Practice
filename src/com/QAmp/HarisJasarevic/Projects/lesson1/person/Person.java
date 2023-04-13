package com.QAmp.HarisJasarevic.Projects.lesson1.person;

public class Person {

    //OOP practice code

    private String firstName;
    private String lastName;
    private int age;

    public Person (final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        age = 0;
    }

    public Person (final String firstName, final String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void printPerson () {
        System.out.println("Hi my name is " + firstName + " " + lastName + " and I'm " + age + " yeas old");
    }

    public void age() { age++;}
}
