package com.gof.designpattern;

import com.gof.designpattern.iterator.Fifo_Store;
import com.gof.designpattern.iterator.Filo_Store;

/**
 * Created by yl3 on 08.12.15.
 */
public class CommandCenter {
    public static void main(String[] args) {
        Fifo_Store fifo_store = new Fifo_Store();

        fifo_store.put("a");
        fifo_store.put("b");
        fifo_store.put("c");

        while (fifo_store.hasNext()) {
            System.out.println(fifo_store.next());
        }

        Filo_Store filo_store = new Filo_Store();

        filo_store.put("1");
        filo_store.put("2");
        filo_store.put("3");

        System.out.println();
        while (filo_store.hasNext()) {
            System.out.println(filo_store.next());
        }

    }
}
