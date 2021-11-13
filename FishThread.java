import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

import java.util.*;

// thread for eachFish
public class FishThread implements Runnable {

    private char gender = ThreadLocalRandom.current().nextBoolean() ? 'M' : 'F';
    private int longevity = ThreadLocalRandom.current().nextInt(0, 50); // 50days is maximum a fish can live

    // contructors

    public FishThread() {
    }

    public FishThread(char gender, int lifelong) {
        this.gender = gender;
        this.longevity = lifelong;
    }

    // getters for gender and how many days can fish live
    public char getGender() {
        return gender;
    }

    public int getLongevity() {
        return longevity;
    }

    @Override
    public void run() {
        synchronized (this) {
            notify();
        }
    }

}