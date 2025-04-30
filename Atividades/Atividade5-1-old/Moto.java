public class Moto extends Transporte {
    private float capacidadeKg;
    private int cilindradas;

    public Moto(String codigo, String nome, float capacidadeKg, int tempoLocacao, float kmRodados, int cilindradas) {
        super(codigo, nome, tempoLocacao, kmRodados);
        this.capacidadeKg = capacidadeKg;
        this.cilindradas = cilindradas;
    }

    @Override
    public float calculaCustoLocacao() {
        return tempoLocacao * kmRodados * cilindradas;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Moto: " + nome + ", Código: " + codigo + ", Cilindradas: " + cilindradas + ", Custo: R$" + calculaCustoLocacao());
    }
}