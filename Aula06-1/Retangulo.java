public class Retangulo extends Object implements Forma { // always heritage before interface
    // Attributes
    private float altura;
    private float largura;

    // Constructor
    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public float calculaArea() {
        return this.largura * this.altura;
    }

    @Override
    public float calculaPerimetro() {
        return 2 * (this.largura + this.altura);
    }
    
}
