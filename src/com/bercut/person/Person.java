package com.bercut.person;

import java.util.Objects;

public class Person implements Comparable<Person> {
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        if (surname.equals(o.surname)) {
            if (name.equals(o.name)) {
                return 0;
            } else {
                return name.compareTo(o.name);
            }
        } else {
            return surname.compareTo(o.surname);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

}
