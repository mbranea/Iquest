package com.iquestgroup.madalinbranea;

import java.util.Map;

/**
 * The entry for the custom map
 */
public class CustomEntry implements Map.Entry {

    private static final int NUMBERS = 500;
    private static final int NUMBERS_MAX_VALUE = 1000;

    private int key;
    private String value;

    CustomEntry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Object setValue(Object value) {
        this.setValue((String) value);
        return value;
    }

    @Override
    public Object getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
