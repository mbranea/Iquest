package com.iquestgroup.ju;

import java.util.Comparator;

public class CountryCapitalComparator {

    static Comparator comparator = new Comparator<Country>() {
        public int compare(Country country1, Country country2) {
            if (country1.getCapital().compareTo(country2.getCapital()) < 0) {
                return -1;
            } else if (country1.getCapital().compareTo(country2.getCapital()) > 0) {
                return 1;
            } else return 0;
        }


    };
}