public class Cliente extends Pessoa {

    // Atributos
    int codigo;

    // Construtor
    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    void imprimeDados() {
        System.out.println("Cliente: " + nome + ", Codigo: " + codigo + ", Nascimento: " + nascimento);
        
    }
    
}
