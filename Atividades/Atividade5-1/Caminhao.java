public class Caminhao extends Veiculo {
    // Atributos
    private float capacidadeKg;
    private int numEixos;

    // Construtor
    public Caminhao(String codigo, String nome, float capacidadeKg, int tempoLocacao, int kmRodados, int numEixos) {
        super(codigo, nome, tempoLocacao, kmRodados);
        this.capacidadeKg = capacidadeKg;
        this.numEixos = numEixos;
    }

    // Getters e Setters
    public float getCapacidadeKg() {
        return capacidadeKg;
    }
    public void setCapacidadeKg(float capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
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
        return getTempoLoc() * getKmRodados() * numEixos;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Capacidade (kg): " + capacidadeKg);
        System.out.println("Tempo de locação (dias): " + getTempoLoc());
        System.out.println("Quilometragem rodados (km): " + getKmRodados());
        System.out.println("Número de eixos: " + numEixos);
    }
}
