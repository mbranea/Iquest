package com.iquestgroup.ju;

import java.util.Random;

public class TrainConstantHash extends Train {

    public TrainConstantHash(int trainNumber, TrainType trainType, int wagonCount) {
        super(trainNumber, trainType, wagonCount);
    }

    public static TrainConstantHash generateTrain() {
        Random random = new Random();
        int trainNumber = random.nextInt(10000);
        TrainType type = TrainType.values()[random.nextInt(TrainType.values().length)];
        int wagonCount = random.nextInt(50);
        return new TrainConstantHash(trainNumber, type, wagonCount);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
