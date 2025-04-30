public class Bicicleta extends Transporte {
    private float capacidadeKg;
    private boolean eletrica;

    public Bicicleta(String codigo, String nome, float capacidadeKg, int tempoLocacao, float kmRodados, boolean eletrica) {
        super(codigo, nome, tempoLocacao, kmRodados);
        this.capacidadeKg = capacidadeKg;
        this.eletrica = eletrica;
    }

    @Override
    public float calculaCustoLocacao() {
        return eletrica ? tempoLocacao * kmRodados * 2 : tempoLocacao * kmRodados;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Bicicleta: " + nome + ", Código: " + codigo + ", Elétrica: " + eletrica + ", Custo: R$" + calculaCustoLocacao());
    }
}