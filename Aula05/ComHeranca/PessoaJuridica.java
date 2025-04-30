public class PessoaJuridica extends Pessoa {
    // Attributes
    private String cnpj;

    // Contructors
    public PessoaJuridica() {
        
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome); // super() MUST be always the first line of the constructor
        this.cnpj = cnpj;
    }

    // Getters and Setters
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
