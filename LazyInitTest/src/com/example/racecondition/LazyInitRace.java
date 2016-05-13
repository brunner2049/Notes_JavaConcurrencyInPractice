package com.example.racecondition;

/**
 * Created by bleach on 2016/5/12.
 */
public class LazyInitRace {

    private ExpensiveObject expensiveObject = null;

    public ExpensiveObject getInstance() {

        if(expensiveObject == null) {
            System.out.println("new object");
            expensiveObject =  new ExpensiveObject();
        }

        return expensiveObject;
    }
}
