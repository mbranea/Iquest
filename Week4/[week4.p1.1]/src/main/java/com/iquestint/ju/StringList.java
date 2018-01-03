package com.iquestint.ju;

import com.iquestint.ju.Exceptions.NotNumberException;
import com.iquestint.ju.Exceptions.NullOrEmptyValueException;
import com.iquestint.ju.Exceptions.OutOfBoundsException;

public class StringList implements List {

    private String[] internalArray = new String[10];
    private int firstEmpty = 0;

    /**
     * Adds an element to the List
     *
     * @param element The element to be added
     * @throws NotNumberException the exception that appears if the string is not a number
     */
    public void add(Object element) throws NotNumberException {
        if (firstEmpty > internalArray.length) {
            throw new OutOfBoundsException();
        }
        if (element == null) {
            throw new NullOrEmptyValueException();
        }
        if (element instanceof String) {
            String candidate = (String) element;
            try {
                int num = Integer.parseInt(candidate);
            } catch (NumberFormatException e) {
                throw new NotNumberException();
            }
            internalArray[firstEmpty] = candidate;
            firstEmpty++;
        }


    }

    /**
     * Gets the element at the given position
     *
     * @param positon the given position
     * @return the element
     */
    public Object get(int positon) {
        if (positon >= firstEmpty) {
            throw new OutOfBoundsException();
        }
        return internalArray[positon];
    }

    /**
     * Checks if the list contains a specific object
     *
     * @param element The element to check
     * @return True if the element is contained
     */
    public boolean contains(Object element) {
        for (int counter = 0; counter <= firstEmpty - 1; counter++) {
            if (internalArray[counter].equals(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Cross-checks two lists to see if the first is contained within the second
     *
     * @param foreignList The "smaller" list
     * @return true if the foreignlist is contained
     */
    public boolean containsAll(List foreignList) {

        for (int counter = 0; counter <= foreignList.size() - 1; counter++) {
            if (!contains(foreignList.get(counter))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the current size of the list
     *
     * @return the size
     */
    public int size() {
        return firstEmpty;
    }
}
