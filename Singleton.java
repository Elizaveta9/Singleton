package com.company;

class Person {
    private static Person myPerson = new Person();
    private int weapons;

    private Person() {
        this.weapons = 3;
    }

    public static Person getMyPerson() {
        return myPerson;
    }

    public int getWeapons() {
        return weapons;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Person human = Person.getMyPerson();
        Person human1 = Person.getMyPerson();

        System.out.println(human.getWeapons());
        System.out.println(human1.getWeapons());

        human.setWeapons(1);

        System.out.println(human1.getWeapons());
        System.out.println(human.getWeapons());
    }
}
