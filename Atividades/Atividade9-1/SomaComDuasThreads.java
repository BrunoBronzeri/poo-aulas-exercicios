import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaComDuasThreads {

    static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {

        // Preencher a lista com 100000 números (todos 1, por exemplo)
        for (int i = 0; i < 100000; i++) {
            list.add(1);
        }

        System.out.println("Tamanho da lista: " + list.size());

        // Criar arrays para armazenar os resultados parciais
        final int[] somaParcial = new int[2];

        // Criar Threads
        Thread t1 = new Thread(() -> {
            int soma = 0;
            for (int i = 0; i < list.size() / 2; i++) {
                soma += list.get(i);
            }
            somaParcial[0] = soma;
        });

        Thread t2 = new Thread(() -> {
            int soma = 0;
            for (int i = list.size() / 2; i < list.size(); i++) {
                soma += list.get(i);
            }
            somaParcial[1] = soma;
        });

        // Iniciar Threads
        t1.start();
        t2.start();

        // Esperar terminar
        t1.join();
        t2.join();

        // Soma final
        int somaFinal = somaParcial[0] + somaParcial[1];
        System.out.println("Soma final com 2 threads: " + somaFinal);
    }
}
