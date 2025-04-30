public class Onibus extends Veiculo {
    // Atributos    
    private int numMaxPassageiros;
    private int numPessoasEmbarcadas;
    private int numEixos;

    // Construtor
    public Onibus(String codigo, String nome, int numMaxPassageiros, int numPessoasEmbarcadas, int tempoLoc, int kmRodados, int numEixos) {
        super(codigo, nome, tempoLoc, kmRodados);
        this.numMaxPassageiros = numMaxPassageiros;
        this.numPessoasEmbarcadas = numPessoasEmbarcadas;
        this.numEixos = numEixos;
    }

    // Getters e Setters
    public int getNumMaxPassageiros() {
        return numMaxPassageiros;
    }
    public void setNumMaxPassageiros(int numMaxPassageiros) {
        this.numMaxPassageiros = numMaxPassageiros;
    }
    public int getNumPessoasEmbarcadas() {
        return numPessoasEmbarcadas;
    }
    public void setNumPessoasEmbarcadas(int numPessoasEmbarcadas) {
        this.numPessoasEmbarcadas = numPessoasEmbarcadas;
    }
    public int getNumEixos() {
        return numEixos;
    }
    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    // Método fator custo locacao
    @Override //IFatorCustoLocacao
    public float fatorCustoLocacao() {
        return getTempoLoc() * getKmRodados() * numEixos * ((float) numPessoasEmbarcadas / numMaxPassageiros);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Numero maximo de passageiros: " + numMaxPassageiros);
        System.out.println("Numero de pessoas embarcadas: " + numPessoasEmbarcadas);
        System.out.println("Tempo de locação (dias): " + getTempoLoc());
        System.out.println("Quilometragem rodados (km): " + getKmRodados());
        System.out.println("Numero de eixos: " + numEixos);
    }
}

