public class Divisao implements IOperacaoMatematica, IApresentacao {
    // Attributes
    private float a;
    private float b;
    final static String operacao = "/";

    // Constructor
    public Divisao(float a, float b) {
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
        return a / b;
    }

    @Override // IApesentacao
    public String mostraOpName() {
        return "Divisão";
    }
    @Override
    public String mostraOpSimbolo() {
        return operacao;
    }
    
}
