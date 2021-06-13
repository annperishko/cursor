package task1;

public class Main {
    public static void main(String[] args) {
        Thread chicken = new Thread(new Chicken());
        chicken.start();



        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Egg");
        }

        if (chicken.isAlive()) {
            try {
                chicken.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Chicken was first");
        } else System.out.println("Egg was first");
    }


}
