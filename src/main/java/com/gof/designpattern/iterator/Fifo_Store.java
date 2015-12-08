package com.gof.designpattern.iterator;

import java.util.ArrayList;

/**
 * Created by yl3 on 08.12.15.
 * First in first out
 */
public class Fifo_Store extends Iterator {

    private ArrayList<String> store = new ArrayList<String>();

    int index;


    public void put(String element) {
        store.add(element);
    }


    @Override
    public boolean hasNext() {
        if (index < store.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (this.hasNext()) {
            return store.get(index++);
        }
        return null;
    }
}
