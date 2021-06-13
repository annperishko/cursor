package task2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);

        for(int i = 1; i <= 5; i++){
            new Thread (new Philosopher(i, semaphore)).start();
            Thread.sleep(500);
        }

    }
}
