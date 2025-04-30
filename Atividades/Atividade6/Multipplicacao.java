public class Multipplicacao implements IOperacaoMatematica, IApresentacao {
    // Attributes
    private float a;
    private float b;
    final static String operacao = "*";

    // Constructor
    public Multipplicacao(float a, float b) {
        this.a = a;
        this.b = b;
    }
    // Getters and Setters
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }

    @Override // IOperacaoMatematica
    public float calcula() {
        return a * b;
    }

    @Override // IApresentacao
    public String mostraOpName() {
        return "Multiplicação";
    }
    @Override
    public String mostraOpSimbolo() {
        return operacao;
    }
}
