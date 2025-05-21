import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(System.in);
            int v[] = new int[3];
            // v[5] = 10;
            // v[2] = 10/0;
            lerArquivo();
        } catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Ocorreu um erro fora do vetor: " + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Ocorreu uma exception matematica: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("Fim do programa.");
        }		
	}

    private static void lerArquivo() throws FileNotFoundException, IOException {
        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        
        scanner.close();
    }
}