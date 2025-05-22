import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ContadorPalavras {

    public static void main(String[] args) {
        // URL da letra de Nothing Else Matters - BOM GOSTO INCLUSIVE :) 
        String url = "http://www.thealmightyguru.com/Music/Lyrics/Metallica/Nothing%20Else%20Matters.txt";

        // Get das lyrics
        String texto = ObtemTxtURL.getTxt(url);

        if (texto == null) {
            System.out.println("Não foi possível obter o texto da URL.");
            return;
        }

        // Padrinizar para lowercase e remover caracteres que não interessam
        texto = texto.replaceAll("[.,!?;:\"()\\[\\]{}']", "").toLowerCase();

        // Quebrar texto em palavras usando StringTokenizer
        StringTokenizer st = new StringTokenizer(texto);

        // Map para contar palavras
        Map<String, Integer> contagemPalavras = new HashMap<>();

        while (st.hasMoreTokens()) {
            String palavra = st.nextToken();

            // Atualizar contagem da respectiv palavra
            contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + 1);
        }

        // Ordenação alfabética. Para melhor localização de uma palavra específica
        Map<String, Integer> contagemOrdenada = new TreeMap<>(contagemPalavras);

        System.out.println("Contagem de palavras:");
        for (Map.Entry<String, Integer> entry : contagemOrdenada.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
