package sample;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetExample {

    private static final int NUMBERS = 500;
    private static final int NUMBERS_MAX_VALUE = 1000;
    private static final int NUMBER_OF_READINGS = 100000;

    private Set<Integer> numbers;
    private Random randomGenerator = new Random();

    public static void main(String[] args) {
        new SetExample().runExample();
        // OUTPUT EXAMPLE:
        // Generating 500 numbers took 1 miliseconds.
        // Only 398 numbers were generated due to uniqueness constraint.
        // Reading random numbers took 21 miliseconds.
        // Out of 100000 tries, only 39806 were successful.

    }

    public void runExample() {
        this.generateNumbers(SetExample.NUMBERS, SetExample.NUMBERS_MAX_VALUE);
        this.readNumbers(SetExample.NUMBER_OF_READINGS, SetExample.NUMBERS_MAX_VALUE);
    }

    private void generateNumbers(int count, int maxValue) {
        long startTime = System.currentTimeMillis();

        this.numbers = new HashSet<Integer>();

        for (int i = 0; i < count; i++) {
            this.numbers.add(this.randomGenerator.nextInt(maxValue));
        }

        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Generating " + count + " numbers took " + duration + " miliseconds.");
        System.out.println("Only " + this.numbers.size() + " numbers were generated due to uniqueness constraint.");
    }

    private void readNumbers(int readingsNo, int maxValue) {
        long startTime = System.currentTimeMillis();

        int numbersFound = 0;
        for (int i = 0; i < readingsNo; i++) {
            int numberToSearch = this.randomGenerator.nextInt(maxValue);
            if (this.numbers.contains(numberToSearch)) {
                numbersFound++;
            }
        }

        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Reading random numbers took " + duration + " miliseconds.");
        System.out.println("Out of " + readingsNo + " tries, only " + numbersFound + " were successful.");
    }
}
 