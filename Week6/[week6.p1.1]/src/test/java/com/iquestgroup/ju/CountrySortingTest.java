package com.iquestgroup.ju;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountrySortingTest {
    @Test
    public void basicSortingTest() {

        Country germany = new Country("Germany", "Berlin");
        Country france = new Country("France", "Paris");
        Country england = new Country("England", "London");
        List<Country> countryList = Arrays.asList(new Country[]{germany, france, england});
        Collections.sort(countryList);
        List<Country> sortedList = Arrays.asList(new Country[]{england, france, germany});
        assertEquals(countryList, sortedList);


    }

    @Test
    public void basicSortingTest2() {

        Country germany = new Country("Germany", "Paris");
        Country france = new Country("France", "Paris");
        Country england = new Country("England", "Paris");
        List<Country> countryList = Arrays.asList(new Country[]{germany, france, england});
        Collections.sort(countryList);
        List<Country> sortedList = Arrays.asList(new Country[]{england, france, germany});
        assertEquals(countryList, sortedList);


    }

    @Test
    public void basicSortingTest3() {

        Country germany = new Country("France", "Berlin");
        Country france = new Country("France", "Paris");
        Country england = new Country("England", "Paris");
        List<Country> countryList = Arrays.asList(new Country[]{germany, france, england});
        Collections.sort(countryList);
        List<Country> sortedList = Arrays.asList(new Country[]{england, germany, france});
        assertEquals(countryList, sortedList);


    }

    @Test
    public void capitalSortingTest1() {

        Country germany = new Country("Germany", "Berlin");
        Country france = new Country("France", "Paris");
        Country england = new Country("England", "London");
        List<Country> countryList = Arrays.asList(new Country[]{germany, france, england});
        Collections.sort(countryList, CountryCapitalComparator.comparator);
        List<Country> sortedList = Arrays.asList(new Country[]{germany, england, france});
        assertEquals(countryList, sortedList);


    }

    @Test
    public void capitalSortingTest2() {

        Country germany = new Country("Germany", "Berlin");
        Country france = new Country("France", "Berlin");
        Country england = new Country("England", "London");
        List<Country> countryList = Arrays.asList(new Country[]{germany, france, england});
        Collections.sort(countryList, CountryCapitalComparator.comparator);
        List<Country> sortedList = Arrays.asList(new Country[]{germany, france, england});
        assertEquals(countryList, sortedList);


    }
}
