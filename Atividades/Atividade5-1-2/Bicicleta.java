public class Bicicleta extends Veiculo implements IFatorCustoDesconto {
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
    public float fatorCustoLocacaoComDesconto(int n) {
        float desconto = 0f;
        if (n >= 2 && n < 5) desconto = 0.05f;
        else if (n >= 5 && n < 10) desconto = 0.1f;
        else if (n >= 10) desconto = 0.15f;
        return fatorCustoLocacao() * (1 - desconto);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Capacidade (kg): " + capacidadeKg);
        System.out.println("Tempo de locação (dias): " + getTempoLoc());
        System.out.println("Quilometragem rodados (km): " + getKmRodados());
        System.out.println("Eletrica: " + (eletrica ? "Sim" : "Não"));
    }

}
