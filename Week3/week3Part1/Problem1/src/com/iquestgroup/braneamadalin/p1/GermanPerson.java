package com.iquestgroup.braneamadalin.p1;

public class GermanPerson extends Person {
    public GermanPerson(String lastName, String surname) {
        super(lastName, surname);
    }

    public GermanPerson(String fullName) {
        super(fullName);
    }

    @Override
    public String getBirthDate() {
        return "15.09.1990";
    }

    @Override
    public String selfDescribe() {
        return "Hallo ich bin der" + listToString(this.firstNameList) + " " + this.lastName + ". Ich bin ein Student und bin am " + getBirthDate() + " geboren.";
    }

    @Override
    public String toString() {
        return selfDescribe();
    }
}


