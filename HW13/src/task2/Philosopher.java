package task2;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable{
    private final int num;
    private Semaphore semaphore;


    public Philosopher(int num, Semaphore semaphore){
        this.num= num;
        this.semaphore = semaphore;
    }

    @Override
    public void run(){
        try{
            semaphore.acquire();
            System.out.println("Philosopher №" + num + "sat down the table");
            Thread.sleep(500);
            System.out.println("Philosopher №" + num + "got up the table");
            semaphore.release();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
