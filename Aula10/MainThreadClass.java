
public class MainThreadClass {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MyThread("t1");
        Thread t2 = new MyThread("t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}