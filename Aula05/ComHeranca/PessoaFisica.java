public class PessoaFisica extends Pessoa {
    // Attributes
    private String cpf;

    // Contructors
    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome); // super() MUST be always the first line of the constructor
        this.cpf = cpf;
        // super.setNome(nome); // set the name in the superclass (the same as before)
        //System.out.println(this.nome); // this.nome is the same as super.nome

    }

    // Getters and Setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Methods
    @Override
    public String toString() {
        return "PessoaFisica [nome=" + this.nome + ", cpf=" + cpf + "]";
    }
}
