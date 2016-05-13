package com.example.racecondition.test;

import com.example.racecondition.LazyInitRace;

/**
 * Created by bleach on 2016/5/12.
 */
public class LazyInitRaceTest1 {

    public static void main(String[] args) {

        LazyInitRace lazyInitRace = new LazyInitRace();

        LazyInitThead lith1 = new LazyInitThead(lazyInitRace);

        LazyInitThead lith2 = new LazyInitThead(lazyInitRace);

        new Thread(lith1).start();

        new Thread(lith2).start();
    }
}

class LazyInitThead implements Runnable {

    private LazyInitRace lazyInitRace;

    public LazyInitThead(LazyInitRace lazyInitRace) {
        this.lazyInitRace = lazyInitRace;
    }

    public void run() {
        System.out.println("------------------------------------");
        for(int i=0; i<5; ++i) {
            System.out.println(Thread.currentThread().getName() + " " +
                    (lazyInitRace.getInstance()).toString());
        }
        System.out.println("------------------------------------");
    }

}
