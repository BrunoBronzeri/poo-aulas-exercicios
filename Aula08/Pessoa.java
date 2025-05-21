import java.io.Serializable;

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    // Atributos
    private int codigo;
    private String nome;
    // Construtores
    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
// Metodos
    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
