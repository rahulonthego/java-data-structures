/**
 * @author rahul
 * @created 08/09/2018
 */
package com.techwithjava.Lists;

import org.junit.Test;

public class AlwaysSortedListTest {


    /**
     *
     * These values will be inserted -- {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
     * to test the following use cases:
     *
     * 1. test for edge scenario
     * 2. test for middle scenario
     * 3. test for duplicate that does exist
     */
    @Test
    public void testInsertScenarios() {
        AlwaysSortedList<Integer> myIntegerList4 = new AlwaysSortedList<>(AlwaysSortedList.ORDER.ASCENDING);
        myIntegerList4.insert(4);
        myIntegerList4.insert(0);
        myIntegerList4.insert(7);
        myIntegerList4.insert(2);
        myIntegerList4.insert(8);
        myIntegerList4.insert(6);
        myIntegerList4.insert(5);
        myIntegerList4.insert(0); //for duplicate scenario
        myIntegerList4.insert(9);
        myIntegerList4.insert(1);
        myIntegerList4.insert(3);
        System.out.println(myIntegerList4.toString());
        assert (0 == myIntegerList4.getValue(0));
        for (int i = 1; i < myIntegerList4.getSize(); i++) {
            assert (i - 1 == myIntegerList4.getValue(i));
        }
    }
}
