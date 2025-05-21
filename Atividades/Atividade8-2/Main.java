import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Vetor com ordem aleatória de int
        int[] numeros = {42, 7, 19, 3, 25, 14, 88, 1, 63, 10};
        
        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(numeros));
        
        // Ordenacao
        Arrays.sort(numeros);
        
        System.out.println("\nVetor ordenado:");
        System.out.println(Arrays.toString(numeros));
        
        // Q6 - Busca binária
        int valorProcurado = 25;
        int indice = Arrays.binarySearch(numeros, valorProcurado);
        
        if (indice >= 0) {
            System.out.println("\nValor " + valorProcurado + " encontrado no índice: " + indice);
        } else {
            System.out.println("\nValor " + valorProcurado + " não encontrado no vetor.");
        }
    }
}
