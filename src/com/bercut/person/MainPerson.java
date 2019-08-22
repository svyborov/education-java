package com.bercut.person;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Семен", "Иванов", 18);
        Person person2 = new Person("Иван", "Иванов", 22);
        Person person3 = new Person("Иван", "Иванов", 19);
        Person person6 = new Person("Иван", "Иванов", 19);
        Person person4 = new Person("Иван", "Петров", 19);
        Person person5 = new Person("Петр", "Петров", 19);

        Set<Person> people = new HashSet<>();

        people.add(person);
        people.add(person4);
        people.add(person3);
        people.add(person2);
        people.add(person5);
        people.add(person4);
        people.add(person6);

        for (Person personFromPeople : people) {
            System.out.println(personFromPeople.getName() + " " + personFromPeople.getSurname() + " "  + personFromPeople.getAge());
        }
        System.out.println(":::::::::::");

        Comparator<? super Person> comporator = Comparator.comparingInt(Person::getAge);

//        people.sort(comporator);
//        Collections.sort(people);


//        for (Person personFromPeople : people) {
//            System.out.println(personFromPeople.getName() + " " + personFromPeople.getSurname() + " "  + personFromPeople.getAge());
//        }
    }
}
