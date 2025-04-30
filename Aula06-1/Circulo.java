public class Circulo extends Object implements Forma { // always heritage before interface
    // Attributes
    private float raio;


    // Constructor
    public Circulo(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float calculaArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public float calculaPerimetro() {
        return (float) (2 * Math.PI * raio);
    }
}
