import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProdutorConsumidor {

    static List<Integer> lista = Collections.synchronizedList(new ArrayList<>());
    static boolean continuar = true;

    public static void main(String[] args) {

        // Thread Produtora - lê números do teclado e adiciona na lista
        Thread produtora = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (continuar) {
                System.out.print("Digite um número (ou -1 para sair): ");
                int numero = scanner.nextInt();

                if (numero == -1) {
                    continuar = false;
                    break;
                }

                synchronized (lista) {
                    lista.add(numero);
                    lista.notify(); // Notifica a thread consumidora que há um item disponível
                }
            }
            scanner.close();
        });

        // Thread Consumidora - pega números da lista e imprime de 1 até x
        Thread consumidora = new Thread(() -> {
            while (continuar || !lista.isEmpty()) {
                int valor;
                synchronized (lista) {
                    while (lista.isEmpty()) {
                        if (!continuar) {
                            return; // Sai se a produtora terminou e a lista está vazia
                        }
                        try {
                            lista.wait(); // Espera até que um item esteja disponível
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    valor = lista.remove(0);
                }

                System.out.println("Contando de 1 até " + valor + ":");
                for (int i = 1; i <= valor; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100); // Apenas para visualizar mais devagar
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Fim da contagem de " + valor + "\n");
            }
        });

        // Iniciar ambas as threads
        produtora.start();
        consumidora.start();

        try {
            produtora.join();
            consumidora.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa encerrado.");
    }
}
