public class Moto extends Veiculo {
    // Attributos
    private int capacidadeKg;
    private int cilindradas;

    // Construtor
    public Moto(String codigo, String nome, int capacidadeKg, int tempoLoc, int kmRodados, int cilindradas) {
        super(codigo, nome, tempoLoc, kmRodados);
        this.capacidadeKg = capacidadeKg;
        this.cilindradas = cilindradas;
    }

    // Getters e Setters
    public int getCapacidadeKg() {
        return capacidadeKg;
    }
    public void setCapacidadeKg(int capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Método fator custo locacao
    @Override //IFatorCustoLocacao
    public float fatorCustoLocacao() {
        return getTempoLoc() * getKmRodados() * cilindradas;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Capacidade (kg): " + capacidadeKg);
        System.out.println("Tempo de locação (dias): " + getTempoLoc());
        System.out.println("Quilometragem rodados (km): " + getKmRodados());
        System.out.println("Cilindradas: " + cilindradas);
    }
}
