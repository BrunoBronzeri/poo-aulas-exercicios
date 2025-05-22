import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaComCincoThreads {

    static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {

        // Preencher a lista com 100000 números (todos 1, por exemplo)
        for (int i = 0; i < 100000; i++) {
            list.add(1);
        }

        System.out.println("Tamanho da lista: " + list.size());

        final int[] somaParcial = new int[5];

        int tamanho = list.size();
        int intervalo = tamanho / 5;

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            final int indice = i;
            int inicio = indice * intervalo;
            int fim = (indice == 4) ? tamanho : inicio + intervalo;

            threads[i] = new Thread(() -> {
                int soma = 0;
                for (int j = inicio; j < fim; j++) {
                    soma += list.get(j);
                }
                somaParcial[indice] = soma;
            });
            threads[i].start();
        }

        // Esperar todas as threads terminarem
        for (Thread t : threads) {
            t.join();
        }

        // Soma final
        int somaFinal = 0;
        for (int soma : somaParcial) {
            somaFinal += soma;
        }

        System.out.println("Soma final com 5 threads: " + somaFinal);
    }
}
