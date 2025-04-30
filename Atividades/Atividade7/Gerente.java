public class Gerente extends Funcionario {
    // Atributos
    String area;

    // Construtor
    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    void imprimeDados() {
        System.out.println("Gerente: " + nome + ", Area: " + area + ", Salario: R$" + salario + ", Imposto: R$" + calculaImposto());
    }

    float calculaImposto() {
        return salario * 0.05f;
    }
    
}
