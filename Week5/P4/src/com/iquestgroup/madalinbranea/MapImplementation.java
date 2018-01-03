package com.iquestgroup.madalinbranea;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapImplementation implements Map {
    private Set<CustomEntry> bucketSet = new HashSet<CustomEntry>();

    /**
     * Returns the size of the map
     * @return size
     */
    @Override
    public int size() {
        return bucketSet.size();
    }

    /**
     * Checks whether there are elements in the map
     * @return true if empty map
     */
    @Override
    public boolean isEmpty() {
        return bucketSet.isEmpty();
    }

    /**
     * Checks if a key is contained
     * @param key the key
     * @return
     */
    @Override
    public boolean containsKey(Object key) {
        for (CustomEntry entry : bucketSet) {
            if (entry.getKey().equals((int) key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a certain value exists
     * @param value the value
     * @return
     */
    @Override
    public boolean containsValue(Object value) {
        long startTime = System.currentTimeMillis();
        for (CustomEntry entry : bucketSet) {
            if (entry.getValue() == (String) value) {
                return true;
            }
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Getting an element took " + duration + " miliseconds.");
        return false;
    }

    /**
     * Gets the value assigned to a certain key
     * @param key The key
     * @return The value or null if unassigned
     */
    @Override
    public Object get(Object key) {
        long startTime = System.currentTimeMillis();
        for (CustomEntry entry : bucketSet) {
            if (entry.getKey().equals((int) key)) {
                return entry.getValue();
            }
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Getting an element took " + duration + " miliseconds.");
        return null;
    }

    /**
     * Puts the key-value pair into the map
     * @param key the key
     * @param value the value
     * @return True if successful
     */
    @Override
    public Object put(Object key, Object value) {
        if (!containsKey(key)) {
            bucketSet.add(new CustomEntry((int) key, (String) value));
            return true;
        }
        return false;


    }

    /**
     * Removes the key-value pair
     * @param key The key to remove
     * @return boolean, true if successful
     */
    @Override
    public Object remove(Object key) {
        if (!containsKey(key)) {
            bucketSet.remove(new CustomEntry((int) key, (String) get(key)));
            return true;
        }
        return false;
    }

    /**
     * Puts map m into the calling map
     * @param m The second map
     */
    @Override
    public void putAll(Map m) {
        for (Object entry : m.keySet()) {
            m.put(entry, m.get(entry));
        }
    }

    /**
     * Removes all entries
     */
    @Override
    public void clear() {
        for (Object entry : keySet()) {
            remove(entry);
        }
    }

    /**
     * Returns a set of keys fro mthe map
     * @return The keyset
     */
    @Override
    public Set keySet() {
        Set<Object> keySet = new HashSet<>();
        for (CustomEntry entry : bucketSet) {
            keySet.add(entry.getKey());
        }
        return keySet;
    }

    /**
     * Returns all the values ontaqined within the map
     * @return The values
     */
    @Override
    public Collection values() {
        Set<Object> keySet = new HashSet<>();
        for (CustomEntry entry : bucketSet) {
            keySet.add(entry.getValue());
        }
        return keySet;
    }

    @Override
    public Set<Entry> entrySet() {
        //nu imi dau seama cum sa rotez inheritance-ul ca sa fie ok
        return null;
    }

}