package com.iquestgroup.ju;

public class Country implements Comparable {


    private String capital;
    private String name;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }


    public int compareTo(Object countryObject) {

        if (countryObject instanceof Country) {
            Country country = (Country) countryObject;
            if (this.getName().equals(country.getName())) {
                return 0;
            } else if (this.getName().compareTo(country.getName()) < 0) {
                return -1;
            } else return 1;
        }
        throw new IllegalArgumentException();
    }
}

