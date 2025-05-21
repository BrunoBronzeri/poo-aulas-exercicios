
public class MyThread extends Thread {

    private String threadId;

    public MyThread(String threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        for (int i =0; i< 10000; i++) {
            System.out.println("Thread " + this.threadId);
        }
    }
}