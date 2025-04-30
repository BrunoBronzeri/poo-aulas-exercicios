public class Automovel extends Veiculo implements IFatorCustoDesconto {
    // atributos
    private int numMaxPassageiros;
    private boolean arCondicionado;

    // Construtor
    public Automovel(String codigo, String nome, int numMaxPassageiros, int tempoLoc, int kmRodados, boolean arCondicionado) {
        super(codigo, nome, tempoLoc, kmRodados);
        this.numMaxPassageiros = numMaxPassageiros;
        this.arCondicionado = arCondicionado;
    }

    // Getters e Setters
    public int getNumMaxPassageiros() {
        return numMaxPassageiros;
    }
    public void setNumMaxPassageiros(int numMaxPassageiros) {
        this.numMaxPassageiros = numMaxPassageiros;
    }
    public boolean isArCondicionado() {
        return arCondicionado;
    }
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    // Método fator custo locacao
    @Override
    public float fatorCustoLocacao() {
        return getTempoLoc() * getKmRodados() * (arCondicionado ? 1.2f : 1.0f);
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
        System.out.println("Numero máximo de passageiros: " + numMaxPassageiros);
        System.out.println("Tempo de locação (dias): " + getTempoLoc());
        System.out.println("Quilometragem rodados (km): " + getKmRodados());
        System.out.println("Ar condicionado: " + (arCondicionado ? "Sim" : "Não"));
    }
}

