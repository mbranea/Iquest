package com.iquestgroup.ju;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.iquestgroup.ju.TrainType.EMPTY;
import static com.iquestgroup.ju.TrainType.FREIGHT;
import static com.iquestgroup.ju.TrainType.PERSON;
import static org.junit.Assert.assertTrue;

public class TrainSetTest {

    @Test
    public void uniqueObjectsTest() {
        Train train1 = new Train(1, PERSON, 10);
        Train train2 = new Train(1, PERSON, 10);
        Train train3 = new Train(3, FREIGHT, 5);
        Train train4 = new Train(4, FREIGHT, 44);
        Train train5 = new Train(5, EMPTY, 3);
        Train train6 = new Train(6, PERSON, 2);

        Set<Train> trainSet = new HashSet<Train>(Arrays.asList(new Train[]{train1, train1, train2, train3, train4, train2, train3, train6}));
        assertTrue(trainSet.size() == 5);

    }
}
