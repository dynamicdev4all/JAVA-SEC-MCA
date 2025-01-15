
class Counter extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("#");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

public class Demo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.start();

        Counter c2 = new Counter();
        c2.start();
    }
}
