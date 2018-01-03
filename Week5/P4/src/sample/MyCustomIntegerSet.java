package sample;

import java.util.ArrayList;
import java.util.List;

public class MyCustomIntegerSet {

    private List<Integer> elements = new ArrayList<Integer>();

    public boolean contains(Integer element) {
        return this.elements.contains(element);
    }

    public boolean add(Integer element) {
        if (!this.contains(element)) {
            this.elements.add(element);
            return true;
        }
        return false;
    }

    public int size() {
        return this.elements.size();
    }

}