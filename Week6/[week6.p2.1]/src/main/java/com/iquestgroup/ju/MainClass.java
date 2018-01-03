package com.iquestgroup.ju;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainClass {

    private static final int NUMBERS = 500;
    private static final int NUMBERS_MAX_VALUE = 1000;
    private static final int NUMBER_OF_READINGS = 100000;


    public static void main(String args[]) {

        MapImplementation map = new MapImplementation();
        populateMap(map);
        map.get(12);

    }

    public static void populateMap(MapImplementation map) {
        long startTime = System.currentTimeMillis();
        for (int counter = 0; counter <= NUMBERS; counter++) {

            List<String> nameSet = Arrays.asList("Steve", "Jack", "John", "Mackenzie", "Jordan");
            Random random = new Random();
            map.put(random.nextInt(NUMBERS_MAX_VALUE), nameSet.get(random.nextInt(4)));


        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Generating " + NUMBERS + " numbers took " + duration + " miliseconds.");
    }
}
