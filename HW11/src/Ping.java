public class Ping implements Runnable{

    PingPong ping;

    public Ping(PingPong ping){
        this.ping = ping;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            ping.ping();
        }
    }
}
