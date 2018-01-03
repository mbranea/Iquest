package com.iquestgroup.ju;

import java.util.Map;

/**
 * The entry for the custom map
 */
public class CustomEntry<Integer, String> implements Map.Entry<Integer, String> {

    private static final int NUMBERS = 500;
    private static final int NUMBERS_MAX_VALUE = 1000;

    private Integer key;
    private String value;

    CustomEntry(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String setValue(String value) {
        this.value = value;
        return value;
    }


    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
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
