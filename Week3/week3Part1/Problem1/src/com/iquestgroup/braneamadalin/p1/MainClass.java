package com.iquestgroup.braneamadalin.p1;

public class MainClass {

    public static void main(String args[]) {
        Person person = new GermanPerson("Deutsch Jan");
        Person person2 = new EnglishPerson("English", "John");
        System.out.println(person);
        System.out.println(person2);
    }
}
