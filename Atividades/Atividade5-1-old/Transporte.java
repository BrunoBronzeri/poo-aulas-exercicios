public abstract class Transporte implements CustoCalculavel {
    protected String codigo;
    protected String nome;
    protected int tempoLocacao;
    protected float kmRodados;

    public Transporte(String codigo, String nome, int tempoLocacao, float kmRodados) {
        this.codigo = codigo;
        this.nome = nome;
        this.tempoLocacao = tempoLocacao;
        this.kmRodados = kmRodados;
    }

    public abstract void imprimeDados();
}