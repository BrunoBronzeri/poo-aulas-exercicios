public class Funcionario extends Pessoa {

    // Atributos
    float salario;

    // Construtor
    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    @Override
    void imprimeDados() {
        System.out.println("Funcionario: " + nome + ", Salario: R$" + salario + ", Imposto: R$" + calculaImposto());
    }

    float calculaImposto(){
        return salario * 0.03f;
    }
    
}
