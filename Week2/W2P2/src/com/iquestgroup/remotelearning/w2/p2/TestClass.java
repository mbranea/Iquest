package com.iquestgroup.remotelearning.w2.p2;

public class TestClass {
    public static void main(String args[]) throws Throwable {

        RunningClass starter = new RunningClass();
        starter.run();

        System.out.println("End");

    }

    public static class RunningClass implements Runnable {
        public void run() {
            Tank testingTankEmpty = new Tank();
            Tank testingTankNotEmpty = new Tank();
            String testString = "Test";
            testingTankEmpty.push(testString);
            testingTankEmpty.push(testString);
            testingTankEmpty.push(testString);
            testingTankEmpty.push(testString);
            testingTankEmpty.pop();
            testingTankEmpty.pop();
            testingTankEmpty.pop();
            testingTankEmpty.pop();

            testingTankNotEmpty.push(testString);
            testingTankNotEmpty.push(testString);
            testingTankNotEmpty.pop();
            System.gc();
        }
    }

}
