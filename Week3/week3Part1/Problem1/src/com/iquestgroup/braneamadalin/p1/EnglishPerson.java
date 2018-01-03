package com.iquestgroup.braneamadalin.p1;

public class EnglishPerson extends Person {
    public EnglishPerson(String lastName, String surname) {
        super(lastName, surname);
    }

    public EnglishPerson(String fullName) {
        super(fullName);
    }

    @Override
    public String getBirthDate() {
        return "25.06.1995";
    }

    @Override
    public String selfDescribe() {
        return "Hello, my name is" + super.listToString(this.firstNameList) + " " + this.lastName + ". I am a programmer and was born on the date of " + this.getBirthDate() + ".";
    }

    @Override
    public String toString() {
        return selfDescribe();
    }
}

