public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private int codigo;
    private String nome;
    private int idade; 

    // Construtores
    public Pessoa(int codigo, String nome, int idade) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    // Getter and Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos
    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    // @Override
    // public int compareTo(Pessoa o) {
    //     if(this.codigo > o.codigo) {
    //         return 1;
    //     } else if(this.codigo < o.codigo) {
    //         return -1;
    //     } else {
    //         return 0;
    //     }
    // }

    @Override
    public int compareTo(Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }
}


