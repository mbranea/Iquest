package com.iquestgroup.ju;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The custom implementation of the Map interface.
 */
public class MapImplementation implements Map<Integer, String> {
    private Set<CustomEntry> bucketSet = new HashSet<CustomEntry>();

    /**
     * Returns the size of the map
     *
     * @return size
     */
    public int size() {
        return bucketSet.size();
    }

    /**
     * Checks whether there are elements in the map
     *
     * @return true if empty maap
     */
    public boolean isEmpty() {
        return bucketSet.isEmpty();
    }

    /**
     * Checks if a key is contained
     *
     * @param key the key
     * @return
     */
    public boolean containsKey(Object key) {
        for (CustomEntry entry : bucketSet) {
            if (entry.getKey().equals((Integer) key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a certain value exists
     *
     * @param value the value
     * @return
     */
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
     *
     * @param key The key
     * @return The value or null if unassigned
     */
    public String get(Object key) {
        long startTime = System.currentTimeMillis();
        for (CustomEntry entry : bucketSet) {
            if (entry.getKey().equals((Integer) key)) {
                return (String) entry.getValue();
            }
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Getting an element took " + duration + " miliseconds.");
        return null;
    }


    /**
     * Puts the key-value pair into the map
     *
     * @param key   the key
     * @param value the value
     * @return True if successful
     */

    public String put(Integer key, String value) {
        if (!containsKey(key)) {
            bucketSet.add(new CustomEntry((int) key, (String) value));
            return "true";
        }
        return "false";


    }

    /**
     * Removes the key-value pair
     *
     * @param key The key to remove
     * @return boolean, true if successful
     */

    public String remove(Object key) {
        if (!containsKey(key)) {
            CustomEntry<Integer, String> entry = new CustomEntry((Integer) key, (String) get(key));
            bucketSet.remove(entry);
            return "true";
        }
        return "false";
    }

    /**
     * Puts map m into the calling map
     *
     * @param m The second map
     */

    public void putAll(Map m) {
        for (Object entry : m.keySet()) {
            m.put(entry, m.get(entry));
        }
    }

    /**
     * Removes all entries
     */

    public void clear() {
        for (Object entry : keySet()) {
            remove(entry);
        }
    }

    /**
     * Returns a set of keys fro mthe map
     *
     * @return The keyset
     */

    public Set keySet() {
        Set<Object> keySet = new HashSet<Object>();
        for (CustomEntry entry : bucketSet) {
            keySet.add(entry.getKey());
        }
        return keySet;
    }

    /**
     * Returns all the values ontaqined within the map
     *
     * @return The values
     */

    public Collection values() {
        Set<Object> keySet = new HashSet<Object>();
        for (CustomEntry entry : bucketSet) {
            keySet.add(entry.getValue());
        }
        return keySet;
    }


    public Set<Entry<Integer, String>> entrySet() {
        //nu imi dau seama cum sa rotez inheritance-ul ca sa fie ok
        return null;
    }

}