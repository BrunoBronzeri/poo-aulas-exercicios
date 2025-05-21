import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();

        pessoas.add(new Pessoa(1, "Lucas", 20));
        pessoas.add(new Pessoa(5, "Ana", 25));
        pessoas.add(new Pessoa(3, "Carlos", 30));

        System.out.println(pessoas.toString());


        ArrayList<Pessoa> pessoas2 = new ArrayList<>();  

        pessoas2.add(new Pessoa(1, "João", 20));
        pessoas2.add(new Pessoa(5, "Maria", 25));
        pessoas2.add(new Pessoa(3, "Mateus", 30));

        System.out.println("------------------------------------------");
        System.out.println(pessoas2.toString());

        // Creates Lists that will be typed
        List<Pessoa> lista1 = new LinkedList<>();
        List<Pessoa> lista2 = new ArrayList<>();
        List<Pessoa> lista3 = new Vector<>();
    }
}
