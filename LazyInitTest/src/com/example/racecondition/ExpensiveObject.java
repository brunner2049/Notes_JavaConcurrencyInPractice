package com.example.racecondition;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bleach on 2016/5/12.
 */
public class ExpensiveObject {

    private List<Integer> integers;

    public ExpensiveObject() {

        integers = new ArrayList<Integer>();

        Integer i = 0;

        for(i=0; i<100000; ++i) {
            integers.add(i);
        }
    }
}
