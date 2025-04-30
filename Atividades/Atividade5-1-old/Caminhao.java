public class Caminhao extends Transporte {
    private float capacidadeKg;
    private int numEixos;

    public Caminhao(String codigo, String nome, float capacidadeKg, int tempoLocacao, float kmRodados, int numEixos) {
        super(codigo, nome, tempoLocacao, kmRodados);
        this.capacidadeKg = capacidadeKg;
        this.numEixos = numEixos;
    }

    @Override
    public float calculaCustoLocacao() {
        return tempoLocacao * kmRodados * numEixos;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Caminhão: " + nome + ", Código: " + codigo + ", Custo: R$" + calculaCustoLocacao());
    }
}