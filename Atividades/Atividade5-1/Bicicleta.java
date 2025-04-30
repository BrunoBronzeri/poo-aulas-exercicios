public class Bicicleta extends Veiculo {
    // Attributos
    private int capacidadeKg;
    private boolean eletrica;

    // Construtor
    public Bicicleta(String codigo, String nome, int capacidadeKg, int tempoLoc, int kmRodados, boolean eletrica) {
        super(codigo, nome, tempoLoc, kmRodados);
        this.capacidadeKg = capacidadeKg;
        this.eletrica = eletrica;
    }

    // Getters e Setters
    public int getCapacidadeKg() {
        return capacidadeKg;
    }
    public void setCapacidadeKg(int capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }
    public boolean isEletrica() {
        return eletrica;
    }
    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    // Método fator custo locacao
    @Override //IFatorCustoLocacao
    public float fatorCustoLocacao() {
        return eletrica ? getTempoLoc() * getKmRodados() * 2 : getTempoLoc() * getKmRodados();
    }

    @Override
    public void imprimeDados() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Capacidade (kg): " + capacidadeKg);
        System.out.println("Tempo de locação (dias): " + getTempoLoc());
        System.out.println("Quilometragem rodados (km): " + getKmRodados());
        System.out.println("Elétrica: " + (eletrica ? "Sim" : "Não"));
    }

}
