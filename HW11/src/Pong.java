public class Pong implements Runnable{
    PingPong pong;

    public Pong(PingPong pong){
        this.pong = pong;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            pong.pong();
        }

    }
}
