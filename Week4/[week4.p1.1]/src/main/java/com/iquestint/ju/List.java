package com.iquestint.ju;

import com.iquestint.ju.Exceptions.NotNumberException;

public interface List<T> {


    void add(T element) throws NotNumberException;

    T get(int positon);

    boolean contains(T element);

    boolean containsAll(List<T> foreignList);

    int size();
}
