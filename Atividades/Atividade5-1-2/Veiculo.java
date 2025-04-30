public abstract class Veiculo implements IFatorCustoLocacao {
    // Attributos
    private String codigo;
    private String nome;
    private int tempoLoc;
    private int kmRodados;

    // Construtor
    public Veiculo(String codigo, String nome, int tempoLoc, int kmRodados) {
        this.codigo = codigo;
        this.nome = nome;
        this.tempoLoc = tempoLoc;
        this.kmRodados = kmRodados;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTempoLoc() {
        return tempoLoc;
    }
    public void setTempoLoc(int tempoLoc) {
        this.tempoLoc = tempoLoc;
    }
    public int getKmRodados() {
        return kmRodados;
    }
    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public abstract void imprimeDados();    

}
