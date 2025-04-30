public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected Data nascimento;

    // Construtor
    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public Data getnascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    // Métodos
    abstract void imprimeDados();

    @Override
    public String toString() {
        return "Nome: " + nome + ", nascimento: " + nascimento;
    }
}
