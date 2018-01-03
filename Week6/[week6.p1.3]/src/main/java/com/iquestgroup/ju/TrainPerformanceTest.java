package com.iquestgroup.ju;

import java.util.ArrayList;
import java.util.List;

public class TrainPerformanceTest {


    public static void main(String args[]) {
        ArrayList<Long> durationList = new ArrayList<Long>();
        ArrayList<Long> constantHashDurationList = new ArrayList<Long>();

        PerformanceUtil util = new PerformanceUtil();

        for (int i = 0; i <= 9; i++) {
            long initial = System.currentTimeMillis();
            util.get100Lists();
            long finalTime = System.currentTimeMillis();
            durationList.add(finalTime - initial);
            initial = System.currentTimeMillis();
            util.get100ListsConstantHash();
            finalTime = System.currentTimeMillis();
            constantHashDurationList.add(finalTime - initial);
        }

        System.out.println("Without constant hash, populating and getting the 100 lists takes on average " + getAverage(durationList) + " milliseconds");
        System.out.println("With constant hash, populating and getting the 100 lists takes on average " + getAverage(constantHashDurationList) + " milliseconds");

    }

    private static long getAverage(List<Long> list) {
        long sum = 0;
        for (Long value : list) {
            sum += value;
        }
        return sum / list.size();
    }
}

