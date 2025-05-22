import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    public static void main(String[] args) {
        List<Carta> baralho = new ArrayList<>();

        // Criar as 48 cartas (numeros de 1 a 12 para cada naipe)
        for (int naipe = 1; naipe <= 4; naipe++) {
            for (int numero = 1; numero <= 12; numero++) {
                baralho.add(new Carta(numero, naipe));
            }
        }

        // Shuffle no baralho
        Collections.shuffle(baralho);

        // Exibe as cartas na ordem embaralhada
        System.out.println("Cartas embaralhadas:");
        for (Carta carta : baralho) {
            System.out.println(carta);
        }
    }
}
