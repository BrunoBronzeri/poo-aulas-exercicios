import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MainList {

    static List<Integer> list = Collections.synchronizedList(new ArrayList<>());
    static Object mutex = new Object();

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(new Runnable () {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    //System.out.println("Thread t1");
                    // Running condition
                    // soma++;
                    list.add(1);

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
                    list.add(1);
                }
            }
        });

        Thread t3 = new Thread(new Runnable (){
            @Override
            public void run() {
                while (true) {
                    int soma = 0;
                    synchronized (mutex) {

                        for(int i = 0; i < list.size(); i++) {
                            soma += list.get(i);
                        }
                        try{                        
                            Thread.sleep(10);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println("Soma parcial: " + soma);
                    }
                }
            }
        });

        t1.start();
        t2.start();

        // Main waits two threads stop running to continue
        t1.join();
        t2.join();
        System.out.println("Tamanho Lista: " + list.size());

    }
}

    