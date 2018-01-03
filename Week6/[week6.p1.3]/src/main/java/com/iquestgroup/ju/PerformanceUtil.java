package com.iquestgroup.ju;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class PerformanceUtil {

    public void get100ListsConstantHash() {

        HashMapContainer container = new HashMapContainer();
        HashMap<TrainConstantHash, List<Integer>> mapOfConstantTrains = container.populateConstantHash();
        get100Lists(mapOfConstantTrains);
    }

    public void get100Lists() {
        HashMapContainer container = new HashMapContainer();

        HashMap<Train, List<Integer>> mapOfTrains = container.populate();
        get100Lists(mapOfTrains);


    }


    private void get100Lists(HashMap<? extends Train, List<Integer>> map) {
        ArrayList<Train> keyList = new ArrayList<Train>(map.keySet());
        Random random = new Random();

        for (int i = 0; i <= 99; i++) {
            List<Integer> placeHolderList = map.get(keyList.get(random.nextInt(3000)));
        }
    }
}


