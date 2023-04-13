package com.QAmp.HarisJasarevic.Projects.lesson1.person;

public class PersonMain {

    //OOP practice code

    public static void main(String[] args) {

        final Person person = new Person("Haris", "Jašarević", 34);
        person.printPerson();
        person.age();
        person.age();
        person.printPerson();
        for (int i = 0; i < 4; i++) {
            person.age();
        }
        person.printPerson();
    }
}
