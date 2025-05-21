import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("text.txt");
        
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            
            String st;
            
            while((st = br.readLine()) != null) {
                System.out.println(st);
            }
            br.close();
        } catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}