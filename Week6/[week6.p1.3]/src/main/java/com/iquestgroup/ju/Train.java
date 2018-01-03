package com.iquestgroup.ju;

import java.util.Random;

public class Train {

    private int trainNumber;
    private TrainType trainType;
    private int wagonCount;

    public Train(int trainNumber, TrainType trainType, int wagonCount) {
        this.trainNumber = trainNumber;
        this.trainType = trainType;
        this.wagonCount = wagonCount;
    }

    public static Train generateTrain() {
        Random random = new Random();
        int trainNumber = random.nextInt(10000);
        TrainType type = TrainType.values()[random.nextInt(TrainType.values().length)];
        int wagonCount = random.nextInt(50);
        return new Train(trainNumber, type, wagonCount);
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public int getWagonCount() {
        return wagonCount;
    }

    public void setWagonCount(int wagonCount) {
        this.wagonCount = wagonCount;
    }


}
