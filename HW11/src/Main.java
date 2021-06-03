public class Main {
    public static void main(String[] args) {

        PingPong pingPong = new PingPong();
        Ping ping = new Ping(pingPong);
        Pong pong = new Pong(pingPong);
        Thread pingThread = new Thread(ping);
        Thread pongThread = new Thread(pong);

        pingThread.start();
        pongThread.start();
    }
}
