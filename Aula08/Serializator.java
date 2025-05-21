import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Pessoa p1 = new Pessoa(1, "João da Silva");
        System.out.println(p1.toString());

        FileOutputStream fos = new FileOutputStream("p1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.close();

        FileInputStream fis = new FileInputStream("p1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Pessoa p2 = (Pessoa) ois.readObject();
        ois.close();

        System.out.println(p2.toString());
    }
}