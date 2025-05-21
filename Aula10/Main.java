public class Main {

    static int soma = 0;
    static Object mutex = new Object();

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(new Runnable () {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    //System.out.println("Thread t1");
                    // Running condition
                    // soma++;

                    incSoma();

                }
            }
        });

        Thread t2 = new Thread(new Runnable () {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    //System.out.println("Thread t2");
                    // Running condition
                    // soma++;

                    incSoma2();
                }
            }
        });

        t1.start();
        t2.start();

        // Main waits two threads stop running to continue
        t1.join();
        t2.join();

        System.out.println("Soma: " + soma);

    }

    // When all method MUST be thread-safe 
    public static synchronized void incSoma() {

        soma++;
    }

    // When only a secton of the method must be thread-safe
    public static void incSoma2() {

        int x = 10;
        x++;

        synchronized (mutex) {
            soma++;
        }
    }
}