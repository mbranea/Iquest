package com.iquestgroup.ju;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashMapContainer {


    public HashMap<Train, List<Integer>> populate() {
        HashMap<Train, List<Integer>> trainMap = new HashMap<Train, List<Integer>>();
        for (int i = 0; i <= 9999; i++) {
            trainMap.put(Train.generateTrain(), new ArrayList<Integer>(generateDaysList()));
        }
        return trainMap;

    }

    public HashMap<TrainConstantHash, List<Integer>> populateConstantHash() {
        HashMap<TrainConstantHash, List<Integer>> constantTrainMap = new HashMap<TrainConstantHash, List<Integer>>();
        for (int i = 0; i <= 9999; i++) {
            constantTrainMap.put(TrainConstantHash.generateTrain(), new ArrayList<Integer>(generateDaysList()));
        }
        return constantTrainMap;

    }

    private Set<Integer> generateDaysList() {
        Random random = new Random();
        Set<Integer> daysSet = new HashSet<Integer>();
        for (int i = 0; i <= random.nextInt(365); i++) {
            daysSet.add(random.nextInt(365));
        }
        return daysSet;
    }

}
