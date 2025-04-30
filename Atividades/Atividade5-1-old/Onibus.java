public class Onibus extends Transporte {
    private int numMaxPessoas;
    private int numPessoasTransportadas;
    private int numEixos;

    public Onibus(String codigo, String nome, int tempoLocacao, float kmRodados, int numMaxPessoas, int numPessoasTransportadas, int numEixos) {
        super(codigo, nome, tempoLocacao, kmRodados);
        this.numMaxPessoas = numMaxPessoas;
        this.numPessoasTransportadas = numPessoasTransportadas;
        this.numEixos = numEixos;
    }

    @Override
    public float calculaCustoLocacao() {
        return tempoLocacao * kmRodados * numEixos * ((float) numPessoasTransportadas / numMaxPessoas);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Ônibus: " + nome + ", Código: " + codigo + ", Custo: R$" + calculaCustoLocacao());
    }
}