package com.gof.designpattern.iterator;

import java.util.ArrayList;

/**
 * Created by yl3 on 08.12.15.
 * First in last out
 */
public class Filo_Store extends Iterator {

    private ArrayList<String> store = new ArrayList<String>();

    int index;

    public void put(String element) {
        store.add(element);
        index = store.size()- 1;
    }

    @Override
    public boolean hasNext() {
        if (index >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (this.hasNext()) {
            return store.get(index--);
        }
        return null;
    }
}
