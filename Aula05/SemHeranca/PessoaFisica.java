public class PessoaFisica {
    // Attributes
    private String nome;
    private String cpf;

    // Contructors
    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Methods
    @Override
    public String toString() {
        return "PessoaFisica [nome=" + nome + ", cpf=" + cpf + "]";
    }
}
