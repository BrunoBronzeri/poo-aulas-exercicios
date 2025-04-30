public class PessoaJuridica {
    // Attributes
    private String nome;
    private String cnpj;

    // Contructors
    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String cnpj) {
        super();
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Methods
    @Override
    public String toString() {
        return "PessoaJuridica [nome=" + nome + ", cnpj=" + cnpj + "]";
    }
}
