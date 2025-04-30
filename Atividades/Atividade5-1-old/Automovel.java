public class Automovel extends Transporte {
    private int numMaxPessoas;
    private boolean arCondicionado;

    public Automovel(String codigo, String nome, int tempoLocacao, float kmRodados, int numMaxPessoas, boolean arCondicionado) {
        super(codigo, nome, tempoLocacao, kmRodados);
        this.numMaxPessoas = numMaxPessoas;
        this.arCondicionado = arCondicionado;
    }

    @Override
    public float calculaCustoLocacao() {
        return tempoLocacao * kmRodados * numMaxPessoas * (arCondicionado ? 1.2f : 1.0f);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Automóvel: " + nome + ", Código: " + codigo + ", Ar-condicionado: " + arCondicionado + ", Custo: R$" + calculaCustoLocacao());
    }
}