package com.CoreJava.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj == null ||getClass() != obj.getClass()) {
            return false;
        }
            Person person = (Person) obj;
        return name.equals(person.name);

    }

    public static void main(String[] args) {
        Person p1 = new Person("Vamshi");
        Person p2 = new Person("Vamshi");

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println(set.size());
    }
}
